package mbsa.toolchain.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.NodeStyle;
import org.eclipse.sirius.diagram.model.business.internal.spec.DNodeSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.eclipse.sirius.viewpoint.ViewpointPackage;

import component.Component;
import component.ComponentPackage;

public class SimulateAction implements IExternalJavaAction {

	protected static int counter = 0;
	public SimulateAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		
		for(EObject s : selections) {
			if(s instanceof ComponentPackage) {
				ComponentPackage cp = (ComponentPackage) s;
				simulate(cp);
			}
		}
	}
	
	protected void simulate(ComponentPackage cp) {
		for(int i = 0; i < 10000; i ++) {
			for(EObject e: cp.getComponents()) {
				ArrayList<EObject> references = new ArrayList<EObject>(new EObjectQuery(e).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET));

				DSemanticDecorator dsds = (DSemanticDecorator) references.get(0);
				DNodeSpec spec = (DNodeSpec) dsds;
				NodeStyle style = spec.getOwnedStyle();
				Random rand = new Random();
				int num = (((Component) e).getIdentity()+rand.nextInt(10000))%2;
				System.out.println("Step : " + i);

				if(num %2 == 0) {
					changeRed(spec);
				}
				else {
					changeGreen(spec);
				}
			}
		}
	}
	
	protected void changeRed(DNodeSpec spec) {
		NodeStyle style = spec.getOwnedStyle();
		style.setBorderColor(RGBValues.create(255, 0, 0));
		style.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
	}
	
	protected void changeGreen(DNodeSpec spec) {
		NodeStyle style = spec.getOwnedStyle();
		style.setBorderColor(RGBValues.create(0, 255, 0));
		style.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
	}
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}
	
	protected double getRand() {
		Random r = new Random();
		return r.nextDouble();
	}
	
	protected double getFIT(Component component) {
		double fit = component.getFit() * 1e-7;
		return fit;
	}

}
