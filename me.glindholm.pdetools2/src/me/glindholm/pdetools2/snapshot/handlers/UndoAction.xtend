package me.glindholm.pdetools2.snapshot.handlers

import me.glindholm.pdetools2.model.pdetools.SnapshotRepository
import me.glindholm.pdetools2.snapshot.SnapshotAction
import me.glindholm.pdetools2.snapshot.SnapshotCoreimport org.eclipse.ui.actions.ActionFactory

class UndoAction extends SnapshotAction{
	
	new(SnapshotRepository repository) {
		super(repository)
		actionDefinitionId = ActionFactory.UNDO.commandId
	}
	
	override run() {
		editDomain.commandStack.undo()
	}
	
	override update() {
		setEnabled(editDomain.commandStack.canUndo)
		text = if(enabled){
			'''Undo «editDomain.commandStack.undoCommand.label»'''			
		}else{
			"Undo"
		}
	}
	
	def getEditDomain(){
		SnapshotCore::editingDomain
	}

}