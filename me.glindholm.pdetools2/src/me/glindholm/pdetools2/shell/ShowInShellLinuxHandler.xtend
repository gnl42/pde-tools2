package me.glindholm.pdetools2.shell

import java.io.File
import me.glindholm.pdetools2.shared.LaunchCommand
import me.glindholm.pdetools2.shared.SharedImages

class ShowInShellLinuxHandler extends AbstractFileBasedExecHandler {

	override createLaunchCommand(File targetFile) {
		new LaunchCommand() => [
			var folder = targetFile
			if(!targetFile.directory){
				folder = targetFile.parentFile
			}
			
			commands += "/bin/bash"
			commands += "-c"
			commands += '''xdg-open "«folder.absolutePath»"'''.toString
		]
	}
	
	override protected getLabel() {
		null
	}
	
	override protected getImageDescriptor() {
		SharedImages::getImageDescriptor(SharedImages::NAUTILUS)
	}
	
}