package me.glindholm.pdetools2.icg.builder

import me.glindholm.pdetools2.icg.ICGConstants
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IProjectNature
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.xtend.lib.annotations.Accessors

class ICGNature implements IProjectNature {
  public static val String ID = "me.glindholm.pdetools2.icg.nature"
  @Accessors IProject project

  override configure() throws CoreException {
    new InstallNatureJob(project).schedule()
  }

  override deconfigure() throws CoreException {
    var description = project.description
    var newBuildSpec = description.buildSpec.filter[it.builderName != ICGConstants::BUILDER_ID]
    description.buildSpec = newBuildSpec;
    project.setDescription(description, new NullProgressMonitor());
    project.findMarkers(ICGConstants::PROBLEM_MARKER_TYPE, true, IResource::DEPTH_INFINITE).forEach[delete]
  }
}
