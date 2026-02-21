package me.glindholm.pdetools2.clipboard

import org.eclipse.swt.custom.StyleRange
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * SWT RTF
 */
class StyleAndText {
	@Accessors StyleRange[] styleRanges
	@Accessors String text

	override String toString(){
		text
	}
}