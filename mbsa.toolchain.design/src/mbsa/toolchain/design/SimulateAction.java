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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import component.Component;

public class SimulateAction implements IExternalJavaAction {

	protected static int counter = 0;
	protected static double failure = 0.0;
	protected Random r = new Random();
	public SimulateAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}
		Component cp = (Component) focus;
		simulate(cp);
//		for(EObject s : selections) {
//			if(s instanceof ComponentPackage) {
//				ComponentPackage cp = (ComponentPackage) s;
//				simulate(cp);
//			}
//		}
	}
	
	protected void simulate(Component cp) {
		for(int i = 0; i < 1000000; i ++) {
			counter++;
			failure += getRand(cp);
		}
		double f = failure/counter;
		if(f > getFIT(cp)) {
			ArrayList<EObject> references = new ArrayList<EObject>(new EObjectQuery(cp).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET));
			DSemanticDecorator dsds = (DSemanticDecorator) references.get(0);
			DNodeSpec spec = (DNodeSpec) dsds;
			NodeStyle style = spec.getOwnedStyle();
			changeGreen(spec);
			Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
			MessageBox mb = new MessageBox(shell, SWT.ICON_SEARCH);
			mb.setText("报告");
			mb.setMessage("经过" + counter +"小时仿真，" + cp.getComponent_name() +"的失效率为：" + f);
			mb.open();
		}
		else {
			ArrayList<EObject> references = new ArrayList<EObject>(new EObjectQuery(cp).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET));
			DSemanticDecorator dsds = (DSemanticDecorator) references.get(0);
			DNodeSpec spec = (DNodeSpec) dsds;
			NodeStyle style = spec.getOwnedStyle();
			changeGreen(spec);
			Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();

			MessageBox mb = new MessageBox(shell, SWT.ICON_SEARCH);
			mb.setText("报告");
			mb.setMessage("经过" + counter +"小时仿真，" + cp.getComponent_name() +"的失效率为：" + f);
			mb.open();
		}
		
		
//		ArrayList<EObject> references = new ArrayList<EObject>(new EObjectQuery(e).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET));
//
//		DSemanticDecorator dsds = (DSemanticDecorator) references.get(0);
//		DNodeSpec spec = (DNodeSpec) dsds;
//		NodeStyle style = spec.getOwnedStyle();
//		Random rand = new Random();
//		int num = (((Component) e).getIdentity()+rand.nextInt(10000))%2;
//		System.out.println("Step : " + i);
//
//		if(num %2 == 0) {
//			changeRed(spec);
//		}
//		else {
//			changeGreen(spec);
//		}
	}
	
//	protected void simulate(ComponentPackage cp) {
//		for(int i = 0; i < 10000; i ++) {
//			for(EObject e: cp.getComponents()) {
//				ArrayList<EObject> references = new ArrayList<EObject>(new EObjectQuery(e).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET));
//
//				DSemanticDecorator dsds = (DSemanticDecorator) references.get(0);
//				DNodeSpec spec = (DNodeSpec) dsds;
//				NodeStyle style = spec.getOwnedStyle();
//				Random rand = new Random();
//				int num = (((Component) e).getIdentity()+rand.nextInt(10000))%2;
//				System.out.println("Step : " + i);
//
//				if(num %2 == 0) {
//					changeRed(spec);
//				}
//				else {
//					changeGreen(spec);
//				}
//			}
//		}
//	}
	
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
	
	protected double getRand(Component component) {
		Random r = new Random();
		return r.nextDouble() * getFIT(component);
	}
	
	protected double getFIT(Component component) {
		double fit = component.getFit() * 1e-7;
		return fit;
	}

}
