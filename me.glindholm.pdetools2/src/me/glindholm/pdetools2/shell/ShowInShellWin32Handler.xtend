package me.glindholm.pdetools2.shell

import java.io.File
import me.glindholm.pdetools2.shared.LaunchCommand
import me.glindholm.pdetools2.shared.SharedImages

class ShowInShellWin32Handler extends AbstractFileBasedExecHandler{
	override protected getLabel() {
		"Show in Explorer"
	}
	
	override protected getImageDescriptor() {
		SharedImages::getImageDescriptor(SharedImages::EXPLORER)
	}

	override public createLaunchCommand(File targetFile) {
		new LaunchCommand() => [
			envMap.put("pde_tools_target_file", '''/select,"«targetFile.absolutePath»"'''.toString)
			
			commands += "cmd"
			commands += "/c"
			commands += "C:/windows/explorer"
			commands += "%pde_tools_target_file%"
		]
	}
}