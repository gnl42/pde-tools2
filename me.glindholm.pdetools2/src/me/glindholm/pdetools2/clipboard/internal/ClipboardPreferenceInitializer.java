package me.glindholm.pdetools2.clipboard.internal;

import static me.glindholm.pdetools2.clipboard.internal.ClipboardPreferenceConstants.CLIPBOARD_COLORLIZE_IN_SELECTION;
import static me.glindholm.pdetools2.clipboard.internal.ClipboardPreferenceConstants.CLIPBOARD_DONT_ASK_WHEN_REMOVE_ALL_CLIPBOARD_ENTRIES;
import static me.glindholm.pdetools2.clipboard.internal.ClipboardPreferenceConstants.CLIPBOARD_MAXIMUM_HISTORY_SIZE;
import static me.glindholm.pdetools2.model.pdetools.ClipItemSortOption.ACTIVE;
import static me.glindholm.pdetools2.model.pdetools.ClipItemSortOption.CAPTURED_ORDER;
import static me.glindholm.pdetools2.model.pdetools.ClipItemSortOption.LAST_USE;
import static me.glindholm.pdetools2.model.pdetools.ClipItemSortOption.USING_COUNT;

import java.text.MessageFormat;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import me.glindholm.pdetools2.PDEToolsCore;

public class ClipboardPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PDEToolsCore.getDefault().getPreferenceStore();

		store.setDefault(CLIPBOARD_COLORLIZE_IN_SELECTION, false);
		store.setDefault(CLIPBOARD_DONT_ASK_WHEN_REMOVE_ALL_CLIPBOARD_ENTRIES, false);
		store.setDefault(CLIPBOARD_MAXIMUM_HISTORY_SIZE, 50);
		store.setDefault(ClipboardPreferenceConstants.CLIPBOARD_NUMBER_OF_LINES_PER_EACH_ITEM, 5);
		store.setDefault(
				ClipboardPreferenceConstants.CLIPBOARD_SORT_ORDER,
				MessageFormat.format("{0},{1},{2},{3}", ACTIVE.getLiteral(), CAPTURED_ORDER.getLiteral(),
						LAST_USE.getLiteral(), USING_COUNT.getLiteral()));

		store.setDefault(ClipboardPreferenceConstants.CLIPBOARD_SET_ACCEPTED_ITEM_ACITVE, true);
	}

}
