package me.glindholm.pdetools2.shell

import me.glindholm.pdetools2.shell.AbstractFileBasedExecHandler
import java.io.File
import me.glindholm.pdetools2.shared.LaunchCommand

class OpenConsoleOSXHandler extends AbstractFileBasedExecHandler {
	override createLaunchCommand(File targetFile) {
		new LaunchCommand() => [
			commands += "open"
			commands += "-a"
			commands += "/Applications/Utilities/Terminal.app"
			commands += targetFile.ensureDirectory.absolutePath
		]
	}
	
	override protected getLabel() {
		"Open Terminal Here"
	}
}