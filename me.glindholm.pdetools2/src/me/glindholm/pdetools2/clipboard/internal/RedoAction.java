package me.glindholm.pdetools2.clipboard.internal;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;

import me.glindholm.pdetools2.model.pdetools.ClipHistory;

public class RedoAction extends ClipboardHistoryAction {

	public RedoAction(ClipHistory clipHistory) {
		super(clipHistory);
		setText("Redo");
	}

	@Override
	public void update() {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getClipHistory());
		CommandStack commandStack = domain.getCommandStack();
		boolean canRedo = commandStack.canRedo();
		setEnabled(canRedo);

		if (canRedo) {
			setText("Redo " + commandStack.getRedoCommand().getLabel());
		} else {
			setText("Redo");
		}
	}

	@Override
	public void run() {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getClipHistory());
		CommandStack commandStack = domain.getCommandStack();
		commandStack.redo();
	}

}
