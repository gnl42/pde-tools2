package me.glindholm.pdetools2.clipboard.internal;

import me.glindholm.pdetools2.clipboard.ClipboardWorkbecnAdapter;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.model.IWorkbenchAdapter;

import me.glindholm.pdetools2.model.pdetools.ClipboardElement;

public class ClipboardWorkbenchAdapterFactory implements IAdapterFactory {

	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
		if (adaptableObject instanceof ClipboardElement && adapterType == IWorkbenchAdapter.class) {
			return ClipboardWorkbecnAdapter.INSTANCE;
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class[] getAdapterList() {
		return new Class[] { IWorkbenchAdapter.class };
	}

}
