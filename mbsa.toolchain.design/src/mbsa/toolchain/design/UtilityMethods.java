/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package mbsa.toolchain.design;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfMetaModel;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.emf.dt.EmfRegistryManager;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class UtilityMethods {

	protected static IFile current_selection;
	protected String metamodel_uri;
	protected String model_uri;
	private static List<Object> metamodels = new ArrayList<Object>();
	protected static HashSet<IResource> resourcePool = new HashSet<>();

	protected String text_query;

	String project_name;

	// progress monitor
	IProgressMonitor progressMonitor = new NullProgressMonitor();

	// get current workspace
	IWorkspace workspace = ResourcesPlugin.getWorkspace();

	// get root of workspace
	IWorkspaceRoot root = workspace.getRoot();

	IProject project;

	public UtilityMethods(String theSelectedFilePath) {
	}

	public static IFile getCurrent_selection() {
		return current_selection;
	}

	public static void setCurrent_selection(IFile current_selection) {
		UtilityMethods.current_selection = current_selection;
	}

	public static String executeQuery(EObject obj, String query, String... mmuri) throws Exception {
		// FIXME: getArtifactProperty returns a list. In this implementation we assume
		// the query model is the first property.

//		URI uri = EcoreUtil.getURI(obj);
//		
//		uri = uri.trimFragment();
//		URI resolved = CommonPlugin.resolve(uri);
//		String referencedModelPath = resolved.toFileString();

		EmfModel theReferencedEMFModel = loadInMemoryEMFModel("M", "true", "true", obj.eResource(), mmuri);
		String result = runStringEOLQuery(theReferencedEMFModel, query).toString();
		System.out.println("Result: " + result);
		return result;
	}
	
	public static String executeQuery(String doc_path, String metadata_path, String query) throws Exception {

		// getting the absolute path
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					projectlocation = project.getLocation().toOSString();
				}
			}
		}
		String doc_absolute_path = projectlocation + doc_path;
		String metadata_absolute_path = projectlocation + metadata_path;

//		registerMetamodel(metadata_path);
		Collection<EPackage> ePackages = registerMetamodel(metadata_absolute_path);
		if (ePackages.size() > 0) {
			for (EPackage ePkg : ePackages) {
				final URI uri = URI.createURI(ePkg.getNsURI());
				if (!metamodels.contains(uri)) {
					metamodels.add(uri);
				}
			}
		}

		String metamodelsString = "";
		for (Object mm : metamodels) {
			metamodelsString = metamodelsString + mm.toString() + ", ";
		}
		metamodelsString = metamodelsString.substring(0, metamodelsString.length() - 2);
		System.out.println(metamodelsString);
		EmfModel theReferencedEMFModel = createAndLoadAnEmfModel(metamodelsString, doc_absolute_path, "M", "true",
				"false");
		String result = runStringEOLQueryOnOneModel(theReferencedEMFModel, query).toString();
		System.out.println("Result: " + result);
		return result;
	}

	public static String getAbsoluteProjectPath() {
		// getting the absolute path
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					projectlocation = project.getLocation().toOSString();
				}
			}
		}
		return projectlocation;
	}

	private static EmfModel createAndLoadAnEmfModel(String metamodelURI, String modelFile, String modelName,
			String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		EmfModel theModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodelURI);
		properties.put(EmfModel.PROPERTY_MODEL_FILE, modelFile);
		properties.put(EmfModel.PROPERTY_NAME, modelName);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		theModel.load(properties, (IRelativePathResolver) null);
		return theModel;
	}
	
	private static EmfModel loadInMemoryEMFModel(String modelName, String readOnLoad, String storeOnDisposal,
			Resource modelFile, String... nsuris) throws EolModelLoadingException {
		InMemoryEmfModel theModel = new InMemoryEmfModel(modelName, modelFile, nsuris);
		StringProperties properties = new StringProperties();
		return theModel;
	}

	private EmfMetaModel createAndLoadAnEmfMetaModel(String metamodelUri, String modelName, String readOnLoad,
			String storeOnDisposal) throws EolModelLoadingException {
		EmfMetaModel metamodel = new EmfMetaModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfMetaModel.PROPERTY_METAMODEL_URI, metamodelUri);
		properties.put(EmfMetaModel.PROPERTY_NAME, modelName);
		properties.put(EmfMetaModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfMetaModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		metamodel.load(properties, (IRelativePathResolver) null);
		return metamodel;
	}

	private String runEOLQuery(ArrayList<IModel> allTheModels, String theFile) throws Exception {
		String ret = "";
		EolModule eolModule = new EolModule();
		for (IModel theModel : allTheModels) {
			eolModule.getContext().getModelRepository().addModel(theModel);
		}
		java.net.URI eolFile = Activator.getDefault().getBundle().getResource(theFile).toURI();
		eolModule.parse(eolFile);
		Object object = eolModule.execute();
		System.out.println(object);
		return ret;
	}

	private static String runStringEOLQueryOnOneModel(IModel model, String query) throws Exception {
		Object result = null;
		EolModule eolModule = new EolModule();
		eolModule.getContext().getModelRepository().addModel(model);
//		if (!query.endsWith(";")) {
//			query = query + ";";
//		}
		try {
			eolModule.parse(query);
//			eolModule.parse("return " +  query);
		} catch (Exception e) {
			throw new IllegalStateException("Pattern expression cannot be parsed.", e);
		}

		try {
			result = eolModule.execute();
		} catch (EolRuntimeException e) {
			throw new IllegalStateException(String.format("The query <%s> could not be evaluated.", query), e);
		}
		System.out.println("Result: " + result);
		eolModule.getContext().getModelRepository().dispose();
		if (result != null) {
			return result.toString();
		}
		else {
			return "null";
		}
		
	}

	private static String runStringEOLQuery(IModel model, String query) throws Exception {
		Object result = null;
		EolModule eolModule = new EolModule();
		eolModule.getContext().getModelRepository().addModel(model);
		try {
			eolModule.parse(query);
		} catch (Exception e) {
			throw new IllegalStateException("Pattern expression cannot be parsed.", e);
		}

		try {
			result = eolModule.execute();
		} catch (EolRuntimeException e) {
			throw new IllegalStateException(String.format("The query <%s> could not be evaluated.", query), e);
		}
		return "";
	}

	private void doEOLTransformation(ArrayList<IModel> allTheModels, String theFile) throws Exception {
		EolModule eolModule = new EolModule();
		for (IModel theModel : allTheModels) {
			eolModule.getContext().getModelRepository().addModel(theModel);
		}
		java.net.URI etlFile = Activator.getDefault().getBundle().getResource(theFile).toURI();
		eolModule.parse(etlFile);
		eolModule.execute();
		eolModule.getContext().getModelRepository().dispose();
	}

	public void refresh(IProject parentProject) throws CoreException {
		parentProject.refreshLocal(1, null);
	}

	private static Collection<EPackage> findEPackages(String resourceLocation) {
		registerMetamodels();

		Set<EPackage> ePackages = new HashSet<EPackage>();

		try {
			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.createResource(URI.createFileURI(resourceLocation));
			r.load(null);
			EcoreUtil.resolveAll(r);
			for (Resource res : rs.getResources()) {
				Iterator<EObject> it = res.getAllContents();
				while (it.hasNext()) {
					ePackages.add(EmfUtil.getTopEPackage(it.next().eClass().getEPackage()));
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return ePackages;
	}

	private static Collection<EPackage> registerMetamodel(String path) {
		IFile file = getCurrentSelection();
		List<EPackage> ePackages = null;
		try {
			for (IResource r : file.getParent().members()) {
				if (path.contains(r.getName())) {
					if (r instanceof IFolder) {
						for(IResource s : ((IContainer) r).members()) {
							if (path.contains(s.getName())) {
								String filename = s.getFullPath().toOSString();
								try {
									EmfRegistryManager.getInstance().addMetamodel(filename);
									LogUtil.logInfo(filename + " registered successfully");
									ePackages = EmfUtil.register(URI.createPlatformResourceURI(filename, true),
											EPackage.Registry.INSTANCE);
								} catch (Exception ex) {
									LogUtil.log(filename + " could not be registered", ex);
								}
							}
						}
					}
					else {
						String filename = r.getFullPath().toOSString();
						try {
							EmfRegistryManager.getInstance().addMetamodel(filename);
							LogUtil.logInfo(filename + " registered successfully");
							ePackages = EmfUtil.register(URI.createPlatformResourceURI(filename, true),
									EPackage.Registry.INSTANCE);
						} catch (Exception ex) {
							LogUtil.log(filename + " could not be registered", ex);
						}
					}
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return ePackages;
	}

	private static boolean registerMetamodels() {
		IFile file = getCurrentSelection();
		try {
			for (IResource r : file.getParent().members()) {
				if (resourcePool.contains(r)) {
					continue;
				}
				resourcePool.add(r);
				String filename = r.getFullPath().toOSString();
				try {
					EmfRegistryManager.getInstance().addMetamodel(filename);
					LogUtil.logInfo(filename + " registered successfully");
				} catch (Exception ex) {
					LogUtil.log(filename + " could not be registered", ex);
					return false;
				}
			}
			return true;
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public static IFile getCurrentSelection() {
		if (current_selection == null) {
			IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IEditorPart editor = workbenchPage.getActiveEditor();
			IEditorInput input = editor.getEditorInput();
			URIEditorInput editorInput = (URIEditorInput) input;
			URI uri = editorInput.getURI();
			URI resolvedFile = CommonPlugin.resolve(uri.trimFragment());

			Path path = new Path(resolvedFile.devicePath());
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IFile file = workspace.getRoot().getFileForLocation(path);
			return file;
		} else {
			return current_selection;
		}
	}

	private static void copyFileUsingStream(File source, File dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}
	}
}