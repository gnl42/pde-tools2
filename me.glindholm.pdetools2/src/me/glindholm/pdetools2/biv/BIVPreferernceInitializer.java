package me.glindholm.pdetools2.biv;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import me.glindholm.pdetools2.PDEToolsCore;

public class BIVPreferernceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PDEToolsCore.getDefault().getPreferenceStore();
		store.setDefault(BIVConfigConstants.BUNDLE_FILTER, "*.ui*");
	}

}
