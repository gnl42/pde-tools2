package me.glindholm.pdetools2.crazyoutline;

import net.jeeeyul.swtend.ui.HSB;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import me.glindholm.pdetools2.PDEToolsCore;

public class CrazyPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PDEToolsCore.getDefault().getPreferenceStore();
		store.setDefault(CrazyOutlineConstants.INVERT_SWIPE_GESTURE, true);
		store.setDefault(CrazyOutlineConstants.FOG_COLOR, new HSB().serialize());
		store.setDefault(CrazyOutlineConstants.FOG_TRANSPARENCY, 10);
	}

}
