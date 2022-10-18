package mbsa.toolchain.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.model.business.internal.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import component.FailureMode;
import hazard.HazardElement;
import hazard.HazardPackage;
import hazard.HazardousSituation;

public class GoToHazardAction implements IExternalJavaAction {

	public GoToHazardAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
				IWorkbenchWindow window = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow();
				IStructuredSelection selection = (IStructuredSelection) window
						.getSelectionService().getSelection();
				
				EObject focus = null;
				for(EObject eobj: selections) {
					focus = eobj;
				}
				
				Session session = SessionManager.INSTANCE.getSession(focus);
				
				DAnalysis root = (DAnalysis) session.getSessionResource()
						.getContents().get(0);
				EList<DView> views = root.getOwnedViews();

				EList<DRepresentation> representations = new BasicEList<DRepresentation>();
				
				for(DView view : views){
					for(DRepresentationDescriptor drd: view.getOwnedRepresentationDescriptors()) {
						representations.add(drd.getRepresentation());
					}
				}
				
				DRepresentation representation = null;
				EObject rootObject = null;
				FailureMode cp = (FailureMode) focus;
				HazardousSituation req = (HazardousSituation) cp.getHazards().get(0);
				for (DRepresentation currentRep : representations) {
					if (currentRep instanceof DSemanticDiagramSpec) {
						rootObject = ((DSemanticDiagramSpec) currentRep)
								.getTarget();
					}

					//Resource eResource = rootObject.eResource();
					//URI eUri = eResource.getURI();

					for(EObject eobj: selections) {
						focus = eobj;
					}
					
					
					if (rootObject instanceof HazardPackage) {
						HazardPackage pkg = (HazardPackage) rootObject;
						for(HazardElement re: pkg.getHazardElement()) {
							if(re.equals(req)) {
								representation = currentRep;
								break;
							}
						}
					}
					
				}
				DialectUIManager.INSTANCE.openEditor(session, representation,
						new NullProgressMonitor());

	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
