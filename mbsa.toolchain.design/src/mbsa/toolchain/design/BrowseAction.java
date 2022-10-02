package mbsa.toolchain.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import base.ModelElement;
import component.Component;
import component.ComponentElement;
import component.ComponentPackage;

public class BrowseAction implements IExternalJavaAction {

	private Component focus = null;
	public BrowseAction() {
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
		dialog.setElements(getComponents(cp).toArray());
		if (dialog.open() == Window.OK) {
			if (dialog.getResult().length > 0) {
				selectionChanged((ModelElement) dialog.getResult()[0]);
			}
		}
		
	}
	
	protected void selectionChanged(ModelElement selection) {
		focus.setCitedElement(selection);
	}
	
	protected ArrayList<Component> getComponents(Component cp) {
		ComponentPackage cpkg = (ComponentPackage) cp.eContainer();
		ArrayList<Component> ret = new ArrayList<>();
		for(ComponentElement c :cpkg.getComponents()) {
			if(c instanceof Component) {
				ret.add((Component) c);
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
