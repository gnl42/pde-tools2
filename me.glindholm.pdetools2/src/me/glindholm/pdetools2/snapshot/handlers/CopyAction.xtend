package me.glindholm.pdetools2.snapshot.handlers

import me.glindholm.pdetools2.model.pdetools.SnapshotRepository
import me.glindholm.pdetools2.shared.SharedImages
import me.glindholm.pdetools2.snapshot.SnapshotAction
import org.eclipse.swt.dnd.Clipboard
import org.eclipse.swt.dnd.FileTransfer
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.actions.ActionFactory

/**
 * https://github.com/jeeeyul/pde-tools/issues/29
 */
class CopyAction extends SnapshotAction {

	new(SnapshotRepository repository) {
		super(repository)
		actionDefinitionId = ActionFactory.COPY.commandId
		text = "Copy"
		imageDescriptor = SharedImages.getImageDescriptor(SharedImages.COPY)
	}

	override update() {
		setEnabled(selection !== null && selection.size > 0)
	}

	override run() {
		var clipboard = new Clipboard(Display.^default)
		var String[] filenames = selection.map[it.absoulteVisibleFilePath]
		clipboard.setContents(#[filenames], #[FileTransfer.instance])
	}

}
