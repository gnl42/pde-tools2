package me.glindholm.pdetools2.clipboard;

import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.ui.services.IServiceLocator;

import me.glindholm.pdetools2.clipboard.internal.ClipboardServiceImpl;
import me.glindholm.pdetools2.model.pdetools.ClipHistory;
import me.glindholm.pdetools2.model.pdetools.ClipboardEntry;

/**
 * @see IServiceLocator#getService(Class)
 * @author Jeeeyul
 * 
 */
public interface IClipboardService {
	public static final IClipboardService INSTANCE = ClipboardServiceImpl.getInstance();
	ClipHistory getHistory();

	Clipboard getNativeClipboard();

	ClipboardEntry createClipEntry();
	
	void createSnapshotIfNeeded();

	void doSave();
}