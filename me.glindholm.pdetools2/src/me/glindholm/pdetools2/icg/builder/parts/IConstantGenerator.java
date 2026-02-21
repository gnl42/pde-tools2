package me.glindholm.pdetools2.icg.builder.parts;

import me.glindholm.pdetools2.model.pdetools.Palette;
import me.glindholm.pdetools2.icg.builder.model.ICGConfiguration;

public interface IConstantGenerator {
	public String generateJavaSource(Palette rootPalette);
	public void setConfig(ICGConfiguration config);
}
