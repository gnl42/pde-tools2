package me.glindholm.pdetools2.clipboard.internal;

import org.eclipse.ui.services.AbstractServiceFactory;
import org.eclipse.ui.services.IServiceLocator;

import me.glindholm.pdetools2.clipboard.IClipboardService;

public class ClipboardServiceFactory extends AbstractServiceFactory {

	public ClipboardServiceFactory() {
	}

	@Override
	public Object create(@SuppressWarnings("rawtypes") Class serviceInterface, IServiceLocator parentLocator,
			IServiceLocator locator) {
		if (serviceInterface == IClipboardService.class) {
			return ClipboardServiceImpl.getInstance();
		}
		return null;
	}

}
