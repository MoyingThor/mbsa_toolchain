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

import component.Component;
import component.ComponentPackage;
import mbsa.MBSAPackage;
import requirement.Requirement;
import requirement.RequirementElement;
import requirement.RequirementPackage;

public class BrowseRequirementAction implements IExternalJavaAction {

	private Component focus = null;
	private HashMap<String, Requirement> map = new HashMap();
	public BrowseRequirementAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		
		// TODO Auto-generated method stub
		Component cp = null;
		for(EObject obj: selections) {
			cp = (Component) obj;
			focus = cp;
		}
		
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(Display.getDefault().getActiveShell(), new LabelProvider() {
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				return super.getText(element);
			}
		});
		
		dialog.setTitle(cp.getComponent_name());
		dialog.setElements(getRequirements(cp).toArray());
		if (dialog.open() == Window.OK) {
			if (dialog.getResult().length > 0) {
				selectionChanged((String) dialog.getResult()[0]);
			}
		}
		
	}
	
	protected void selectionChanged(String selection) {
		Requirement r = map.get(selection);
		focus.getRequirements().add(r);
	}
	
	protected ArrayList<String> getRequirements(Component cp) {
		ComponentPackage cpkg = (ComponentPackage) cp.eContainer();
		MBSAPackage mbsapkg = (MBSAPackage) cpkg.eContainer();
		ArrayList<String> ret = new ArrayList<>();
		for(RequirementPackage rp :mbsapkg.getRequirementPackage()) {
			for(RequirementElement re : rp.getRequirementElement()) {
				if(re instanceof Requirement) {
					Requirement r = (Requirement) re;
					map.put(re.getName().getContent(), r);
					ret.add(re.getName().getContent());
				}
			}
		}
		return ret;
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
