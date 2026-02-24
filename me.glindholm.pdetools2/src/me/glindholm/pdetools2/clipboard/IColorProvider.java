package me.glindholm.pdetools2.clipboard;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

public interface IColorProvider {
	public Color getColor(RGB rgb);
}
