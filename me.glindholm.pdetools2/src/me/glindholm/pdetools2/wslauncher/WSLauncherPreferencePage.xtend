package me.glindholm.pdetools2.wslauncher

import me.glindholm.pdetools2.PDEToolsCore
import net.jeeeyul.swtend.SWTExtensions
import org.eclipse.jface.preference.PreferencePage
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPreferencePage

import static me.glindholm.pdetools2.wslauncher.IWSLauncherPreferernceConstants.*

class WSLauncherPreferencePage extends PreferencePage implements IWorkbenchPreferencePage{
	extension SWTExtensions = SWTExtensions::INSTANCE
	
	Button clearPersistedStateButton
	
	override protected createContents(Composite parent) {
		var result = parent.newComposite[
			layout = newGridLayout
			clearPersistedStateButton = newCheckbox[
				text = "Clear Persisted States when launch new workspace"
			]
		]
		
		load()
		
		return result
	}
	
	override init(IWorkbench workbench) {
	}
	
	def load(){
		var store = PDEToolsCore::^default.preferenceStore
		clearPersistedStateButton.selection = store.getBoolean(CLEAR_PERSISTED_STATE)
	}
	
	override protected performDefaults() {
		var store = PDEToolsCore::^default.preferenceStore
		clearPersistedStateButton.selection = store.getDefaultBoolean(CLEAR_PERSISTED_STATE)
		super.performDefaults()
	}
	
	override performOk() {
		var store = PDEToolsCore::^default.preferenceStore
		store.setValue(CLEAR_PERSISTED_STATE, clearPersistedStateButton.selection)
		
		return super.performOk()
	}
	
}