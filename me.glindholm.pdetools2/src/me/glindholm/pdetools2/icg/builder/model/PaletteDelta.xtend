package me.glindholm.pdetools2.icg.builder.model

import me.glindholm.pdetools2.model.pdetools.FieldNameOwner
import org.eclipse.xtend.lib.annotations.Accessors

class PaletteDelta {
	@Accessors FieldNameOwner before
	@Accessors FieldNameOwner after
	
	def boolean isRefactorTarget(){
		before !== null && after !== null
	}
	
}