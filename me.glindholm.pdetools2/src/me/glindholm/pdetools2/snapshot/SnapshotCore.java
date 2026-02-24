package me.glindholm.pdetools2.snapshot;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import me.glindholm.pdetools2.Debug;
import me.glindholm.pdetools2.PDEToolsCore;
import me.glindholm.pdetools2.clipboard.internal.BinaryResourceFactory;
import me.glindholm.pdetools2.model.pdetools.PdetoolsFactory;
import me.glindholm.pdetools2.model.pdetools.SnapshotRepository;
import me.glindholm.pdetools2.model.pdetools.provider.PdetoolsItemProviderAdapterFactory;

public class SnapshotCore {
    private static SnapshotRepository repository;

    private static AdapterFactoryEditingDomain editingDomain;

    public static void clean() {
        new CleanRepository().run();
    }

    public static synchronized AdapterFactoryEditingDomain getEditingDomain() {
        if (editingDomain == null) {
            editingDomain = new AdapterFactoryEditingDomain(new PdetoolsItemProviderAdapterFactory(),
                    new BasicCommandStack());
            editingDomain.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap()
                    .put("data", new BinaryResourceFactory());
        }
        return editingDomain;
    }

    private static URI getPersistanceURI() {
        IPath path = PDEToolsCore.getDefault().getStateLocation().append("snapshot");
//		File folder = path.setDevice(null).toFile();
        File folder = path.toFile();
        if (!folder.exists()) {
            folder.mkdirs();
        }

        URI url = URI.createFileURI(path.append("snapshot.data").toPortableString());
        return url;
    }

    public static SnapshotRepository getRepository() {
        if (repository == null) {
            Resource resource = getResource();
            try {
                resource.load(new HashMap<Object, Object>());
                repository = (SnapshotRepository) resource.getContents().get(0);
                Debug.println("Snapshot repository was loaded.");
            } catch (Exception e) {
                repository = PdetoolsFactory.eINSTANCE.createSnapshotRepository();
                resource.getContents().clear();
                resource.getContents().add(repository);
                Debug.println("Snapshot repository was created.");
            }
        }
        return repository;
    }

    private static Resource getResource() {
        Resource resource = null;
        try {
            resource = getResourceSet().getResource(getPersistanceURI(), true);
        } catch (Exception e) {
            resource = getResourceSet().createResource(getPersistanceURI());
            Debug.println("New resource for snapshot repository was created.");
        }
        return resource;
    }

    private static ResourceSet getResourceSet() {
        return getEditingDomain().getResourceSet();
    }

    public static void save() {
        try {
            getResource().save(new HashMap<Object, Object>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
