package me.glindholm.pdetools2.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.PlatformUI;

public class CoreExpressionSourceProvider extends AbstractSourceProvider {

	public CoreExpressionSourceProvider() {
	}

	@Override
	public void dispose() {

	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map getCurrentState() {
		Map<Object, Object> result = new HashMap<Object, Object>();
		result.put("me.glindholm.pdetools2.workbench", PlatformUI.getWorkbench());
		result.put("me.glindholm.pdetools2.platform", Platform.class);
		return result;
	}

	@Override
	public String[] getProvidedSourceNames() {
		return new String[] { "me.glindholm.pdetools2.workbench", "me.glindholm.pdetools2.platform" };
	}

}
