package mbsa.toolchain.design;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import component.Component;

public class BrowseFileAction implements IExternalJavaAction {

	public BrowseFileAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		EObject focus = null;
		for(EObject eobj: selections) {
			focus = eobj;
		}
		Component cp = (Component) focus;
		
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText("Locate document");
		
		//set initial open path
		String proj_path = getProjectPath();
		fileDialog.setFilterPath(getProjectPath());
		
		
		//compute path
		String path = fileDialog.open();
		if (path != null) {
			File f = new File(path);
			Path p = new Path(f.getAbsolutePath());
			int segmentCount = p.segmentCount();
			path = File.separator + p.segment(segmentCount-2) + File.separator + p.segment(segmentCount-1);
			
			cp.getImplementationConstraint().get(0).getContent().getValue().get(0).setContent(path);
		}

	}
	
	private String getProjectPath() {
	    IWorkbenchWindow window = PlatformUI.getWorkbench()
	            .getActiveWorkbenchWindow();

		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
		   IEditorInput input = activeEditor.getEditorInput();

		   IProject project = input.getAdapter(IProject.class);
		   if (project == null) {
		      IResource resource = input.getAdapter(IResource.class);
		      if (resource != null) {
		         project = resource.getProject();
		         return project.getFullPath().toOSString();
		      }
		   }
		   else {
			  return project.getFullPath().toOSString();
		   }
		}
		return null;
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
