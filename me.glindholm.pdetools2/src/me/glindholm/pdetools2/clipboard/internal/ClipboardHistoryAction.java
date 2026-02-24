package me.glindholm.pdetools2.clipboard.internal;

import org.eclipse.jface.action.Action;

import me.glindholm.pdetools2.model.pdetools.ClipHistory;

public abstract class ClipboardHistoryAction extends Action {
	private ClipHistory clipHistory;

	protected ClipHistory getClipHistory() {
		return clipHistory;
	}

	public ClipboardHistoryAction(ClipHistory clipHistory) {
		this.clipHistory = clipHistory;
	}

	public abstract void update();
}
