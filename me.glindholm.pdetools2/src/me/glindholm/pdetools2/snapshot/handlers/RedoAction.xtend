package me.glindholm.pdetools2.snapshot.handlers

import me.glindholm.pdetools2.model.pdetools.SnapshotRepository
import me.glindholm.pdetools2.snapshot.SnapshotAction
import me.glindholm.pdetools2.snapshot.SnapshotCoreimport org.eclipse.ui.actions.ActionFactory

class RedoAction extends SnapshotAction{
	
	new(SnapshotRepository repository) {
		super(repository)
		actionDefinitionId = ActionFactory.REDO.commandId
	}
	
	override run() {
		editDomain.commandStack.redo()
	}
	
	override update() {
		setEnabled(editDomain.commandStack.canRedo)
		
		text = if(enabled){
			'''Redo «editDomain.commandStack.redoCommand.label»'''			
		}else{
			"Redo"
		}
	}
	
	def getEditDomain(){
		SnapshotCore::editingDomain
	}

}