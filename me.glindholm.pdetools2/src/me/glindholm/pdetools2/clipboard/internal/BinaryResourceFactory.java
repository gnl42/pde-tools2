package me.glindholm.pdetools2.clipboard.internal;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;

public class BinaryResourceFactory implements Resource.Factory {
	@Override
	public Resource createResource(URI uri) {
		return new BinaryResourceImpl(uri);
	}

}
