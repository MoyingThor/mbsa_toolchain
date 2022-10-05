package mbsa.toolchain.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import component.Component;

public class PerformQueryAction implements IExternalJavaAction {

	public PerformQueryAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}
		Component cp = (Component) focus;
		
		cp.getImplementationConstraint().get(3).getContent().getValue().get(0).setContent("Ö´ÐÐÍê±Ï£¡");
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
