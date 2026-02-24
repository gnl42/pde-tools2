package me.glindholm.pdetools2.wslauncher;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import me.glindholm.pdetools2.PDEToolsCore;

public class WSLauncherPreferernceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PDEToolsCore.getDefault().getPreferenceStore();
		store.setDefault(IWSLauncherPreferernceConstants.CLEAR_PERSISTED_STATE, false);
	}

}
