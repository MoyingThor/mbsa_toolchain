package mbsa.toolchain.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import component.FailureMode;
import hazard.HazardElement;
import hazard.HazardPackage;
import hazard.HazardousSituation;
import mbsa.MBSAPackage;

public class BrowseHazardAction implements IExternalJavaAction {

	private FailureMode focus = null;
	private HashMap<String, HazardousSituation> map = new HashMap();

	public BrowseHazardAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		
		// TODO Auto-generated method stub
		FailureMode cp = null;
		for(EObject obj: selections) {
			cp = (FailureMode) obj;
			focus = cp;
		}
		
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(Display.getDefault().getActiveShell(), new LabelProvider() {
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				return super.getText(element);
			}
		});
		
		dialog.setTitle(cp.getMode());
		dialog.setElements(getHazards(cp).toArray());
		if (dialog.open() == Window.OK) {
			if (dialog.getResult().length > 0) {
				selectionChanged((String) dialog.getResult()[0]);
			}
		}
	}

	protected void selectionChanged(String selection) {
		HazardousSituation r = map.get(selection);
		focus.getHazards().add(r);
	}
	
	protected ArrayList<String> getHazards(FailureMode cp) {
		MBSAPackage mbsapkg = getMBSAPackage(cp);
		ArrayList<String> ret = new ArrayList<>();
		for(HazardPackage rp :mbsapkg.getHazardPackage()) {
			for(HazardElement re : rp.getHazardElement()) {
				if(re instanceof HazardousSituation) {
					HazardousSituation hs = (HazardousSituation) re;
					map.put(hs.getName().getContent(), hs);
					ret.add(hs.getName().getContent());
				}
			}
		}
		return ret;
	}
	
	protected MBSAPackage getMBSAPackage(FailureMode cp) {
		EObject obj = cp;
		while(obj.eContainer() != null && !(obj instanceof MBSAPackage)) {
			obj = obj.eContainer();
		}
		return (MBSAPackage) obj;
	}
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
