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
		
		cp.getImplementationConstraint().get(3).getContent().getValue().get(0).setContent("执行完毕！");
		
		String doc_path = cp.getImplementationConstraint().get(0).getContent().getValue().get(0).getContent();
		String metadata_path = cp.getImplementationConstraint().get(1).getContent().getValue().get(0).getContent();
		//assuming EMF models for now
		String constraint = cp.getImplementationConstraint().get(2).getContent().getValue().get(0).getContent();
		String result = "执行完毕";
		try {
			result = UtilityMethods.executeQuery(doc_path, metadata_path, constraint);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cp.getImplementationConstraint().get(3).getContent().getValue().get(0).setContent(result);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
