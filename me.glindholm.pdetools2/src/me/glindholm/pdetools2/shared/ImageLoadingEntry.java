package me.glindholm.pdetools2.shared;

import org.eclipse.swt.graphics.ImageData;

public class ImageLoadingEntry<KeyType> {
	public KeyType key;
	public ImageData image;

	public ImageLoadingEntry(KeyType key, ImageData image) {
		this.key = key;
		this.image = image;
	}

}
