package me.glindholm.pdetools2.shell

import me.glindholm.pdetools2.shell.AbstractFileBasedExecHandler
import java.io.File
import me.glindholm.pdetools2.shared.LaunchCommand

class OpenConsoleLinuxHandler extends AbstractFileBasedExecHandler {
	override createLaunchCommand(File targetFile) {
		new LaunchCommand() => [
			commands += "/bin/bash"
			commands += "-c"
			commands += '''gnome-terminal --working-directory="«targetFile.ensureDirectory.absolutePath»"'''.toString
			
		]
	}
	
	override protected getLabel() {
		"Open Terminal Here"
	}
}