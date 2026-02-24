package me.glindholm.pdetools2.snapshot;

import java.util.List;

import org.eclipse.jface.action.Action;

import me.glindholm.pdetools2.model.pdetools.SnapshotEntry;
import me.glindholm.pdetools2.model.pdetools.SnapshotRepository;

public class SnapshotAction extends Action {
	private SnapshotRepository repository;
	private List<SnapshotEntry> selection;

	public List<SnapshotEntry> getSelection() {
		return selection;
	}

	public SnapshotRepository getRepository() {
		return repository;
	}

	public SnapshotAction(SnapshotRepository repository) {
		this.repository = repository;
	}

	public void update() {

	}

	public void setSelection(List<SnapshotEntry> selection) {
		this.selection = selection;

	}

}
