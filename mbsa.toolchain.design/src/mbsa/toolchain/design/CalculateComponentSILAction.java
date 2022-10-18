package mbsa.toolchain.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import component.Component;
import component.FailureMode;
import component.SafetyMechanism;

public class CalculateComponentSILAction implements IExternalJavaAction {

	public CalculateComponentSILAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}
		Component cp = (Component) focus;
		
		double sff = 0.0;
		double ps = 0.0;
		double pdd = 0.0;
		double pdu = 0.0;
		for(FailureMode fm: cp.getFailure_modes()) {
			
			ps += calculate_prob_safe(cp, fm);
			pdd += calculate_prob_dd(cp, fm);
			pdu += calculate_prob_du(cp, fm);
			//sff = (ps + pdd)/(ps + pdd + pdu);
			//System.out.println("SFF for" + fm.getMode() + "is: " + sff);
		}
		sff = (ps + pdd)/(ps + pdd + pdu);
		int sil = determineSIL(0, sff);
		cp.setSil(sil);
		
//		JFrame jframe = new JFrame();
//		JOptionPane.showMessageDialog(jframe, cp.getComponent_name() + "的安全完整性等级为：SIL" + sil);
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		MessageBox mb = new MessageBox(shell, SWT.ICON_SEARCH);
		mb.setText("报告");
		mb.setMessage(cp.getComponent_name() + "的安全完整性等级为：SIL" + sil);
		mb.open();
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}
	
	protected int determineSIL(int tolerance, double sff) {
		int ret = 0;
		if(sff < 0.6) {
			ret = 1;
		}
		else if(sff >= 0.6 && sff < 0.9) {
			ret = 2;
		}
		else if(sff >= 0.9 && sff < 0.99) {
			ret = 3;
		}
		else if(sff >= 0.99) {
			ret = 3;
		}
		return ret;
	}

	protected double calculate_prob_safe(Component component, FailureMode fm) {
		double ret = 0.0;
		double fit = getFIT(component);
		if(!fm.isSafety_related()) {
			double distribution = fm.getProbability();
			ret += fit*distribution;
		}
		return ret;
	}
	
	protected double calculate_prob_dd(Component component, FailureMode fm) {
		double ret = 0.0;
		double fit = getFIT(component);
		if(fm.isSafety_related()) {
			double distribution = fm.getProbability();
			double failure = fit*distribution;
			double coverage = 0.0;
			for(SafetyMechanism sm : getSafetyMechanism(component, fm)) {
				ret += failure*sm.getCoverage();
			}
		}
		return ret;
	}
	
	protected double calculate_prob_du(Component component, FailureMode fm) {
		double ret = 0.0;
		double fit = getFIT(component);
		if(fm.isSafety_related()) {
			double distribution = fm.getProbability();
			double failure = fit*distribution;
			double coverage = 0.0;
			for(SafetyMechanism sm : getSafetyMechanism(component, fm)) {
				ret += failure*(1-sm.getCoverage());
			}
		}
		return ret;
	}
	
	protected ArrayList<SafetyMechanism> getSafetyMechanism(Component cp, FailureMode fm) {
		ArrayList<SafetyMechanism> ret = new ArrayList<SafetyMechanism>();
		for(SafetyMechanism sm: cp.getSafety_mechanisms()) {
			if(sm.getHandle().equals(fm)) {
				ret.add(sm);
			}
		}
		return ret;
	}
	
	protected double getFIT(Component component) {
		double fit = component.getFit() * 1e-7;
		return fit;
	}
}
