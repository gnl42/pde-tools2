package me.glindholm.pdetools2.shell

import java.io.File
import me.glindholm.pdetools2.shared.LaunchCommand
import me.glindholm.pdetools2.shared.SharedImages
import org.eclipse.ui.commands.IElementUpdater

class ShowInShellOSXHandler extends AbstractFileBasedExecHandler implements IElementUpdater {
	override protected getLabel() {
		"Reveal in Finder"
	}
	
	override protected getImageDescriptor() {
		SharedImages::getImageDescriptor(SharedImages::FINDER)
	}

	override public createLaunchCommand(File targetFile) {
		new LaunchCommand() => [
			commands += "osascript"
			commands += "-e"
			commands += '''tell app "Finder" to activate reveal Posix file "«targetFile.absolutePath»"'''.toString
		]
	}
	
}