package me.glindholm.pdetools2.shell

import me.glindholm.pdetools2.shell.AbstractFileBasedExecHandler
import java.io.File
import me.glindholm.pdetools2.shared.LaunchCommand

class OpenConsoleWin32Handler extends AbstractFileBasedExecHandler {
	override createLaunchCommand(File targetFile) {
		new LaunchCommand() => [
			envMap.put("INIT_DIR", '''"cd «targetFile.ensureDirectory.absolutePath»"''')
			commands += "cmd"
			commands += "/c"
			commands += "start"
			commands += "cmd"
			commands += "/K"
			commands += "%INIT_DIR%"
			
		]
	}
	
	override protected getLabel() {
		"Open CMD Here"
	}
}