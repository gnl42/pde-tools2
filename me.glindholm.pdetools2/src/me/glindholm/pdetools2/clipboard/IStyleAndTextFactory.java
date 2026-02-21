package me.glindholm.pdetools2.clipboard;

import me.glindholm.pdetools2.clipboard.StyleAndText;

public interface IStyleAndTextFactory {
	public StyleAndText createFromRTFString(String rtf);
}
