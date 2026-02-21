package me.glindholm.pdetools2.shared;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class ImageCanvas extends Canvas {
	private Image backgroundImage;
	private Pattern backgroundPattern;

	private Image image;
	private Procedure1<Point> deltaHandler = new Procedure1<Point>() {
		@Override
		public void apply(Point delta) {
			handleDelta(delta);
		}
	};

	public Image getImage() {
		return image;
	}

	protected void handleDelta(Point delta) {
		int newX = getHorizontalBar().getSelection() - delta.x;
		int newY = getVerticalBar().getSelection() - delta.y;
		getHorizontalBar().setSelection(newX);
		getVerticalBar().setSelection(newY);
		redraw();
	}

	public ImageCanvas(Composite parent) {
		super(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWT.DOUBLE_BUFFERED);

		DragAdapter dragAdapter = new DragAdapter(this);
		dragAdapter.setDeltaHandler(deltaHandler);

		addListener(SWT.Paint, new Listener() {
			@Override
			public void handleEvent(Event event) {
				onPaint(event.gc);
			}
		});

		// �̹��� ĵ������ ũ�Ⱑ ����Ǹ� ��ũ�ѹٸ� ������Ʈ
		addListener(SWT.Resize, new Listener() {
			@Override
			public void handleEvent(Event event) {
				updateScrollBars();
			}
		});

		// ��ũ�ѹٰ� �̵��Ǹ� �ٽ� �׸���
		getHorizontalBar().addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				redraw();
			}
		});

		getVerticalBar().addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				redraw();
			}
		});

		backgroundImage = new Image(getDisplay(), new ImageData(getClass().getResourceAsStream(
				"image-canvas-background.gif")));
		backgroundPattern = new Pattern(getDisplay(), backgroundImage);

		addListener(SWT.Dispose, new Listener() {
			@Override
			public void handleEvent(Event event) {
				backgroundPattern.dispose();
				backgroundImage.dispose();
			}
		});

	}

	private void onPaint(GC gc) {
		Rectangle clientArea = getClientArea();
		gc.setClipping(clientArea);

		gc.setBackground(getDisplay().getSystemColor(SWT.COLOR_GRAY));
		int boxSize = 10;
		int maxCol = clientArea.width / boxSize + 1;
		int maxRow = clientArea.height / boxSize + 1;

		for (int r = 0; r < maxRow; r++) {
			for (int c = 0; c < maxCol; c++) {
				if (r % 2 == c % 2) {
					gc.fillRectangle(c * boxSize, r * boxSize, boxSize, boxSize);
				}
			}
		}

		if (image == null || image.isDisposed()) {
			return;
		}
		Rectangle imageBounds = image.getBounds();

		int x = -getHorizontalBar().getSelection();
		int y = -getVerticalBar().getSelection();

		if (clientArea.width > imageBounds.width) {
			x += (clientArea.width - imageBounds.width) / 2;
		}

		if (clientArea.height > imageBounds.height) {
			y += (clientArea.height - imageBounds.height) / 2;
		}

		gc.drawImage(image, x, y);
	}

	private void updateScrollBars() {
		ScrollBar hBar = getHorizontalBar();
		ScrollBar vBar = getVerticalBar();

		if (image == null || image.isDisposed()) {
			hBar.setVisible(false);
			vBar.setVisible(false);
			return;
		}

		// ǥ���ؾ��� �̹����� ũ��
		Rectangle imageBounds = image != null ? image.getBounds() : new Rectangle(0, 0, 0, 0);

		// ǥ�ÿ� ����� �� �ִ� Ŭ���̾�Ʈ ����
		Rectangle clientArea = getClientArea();

		// ��ũ�ѹ� ǥ�� ���� ���, ǥ���ؾ��� �׸��� Ŭ���̾�Ʈ �������� ������ ǥ��
		hBar.setVisible(imageBounds.width > clientArea.width);
		vBar.setVisible(imageBounds.height > clientArea.height);

		hBar.setMaximum(imageBounds.width);
		vBar.setMaximum(imageBounds.height);

		clientArea = getClientArea();

		// ���� ǥ������ ������ ǥ���ؾ��� ��ü ������ ���� ������ ���
		double hRatio = clientArea.width / (double) imageBounds.width;
		double vRatio = clientArea.height / (double) imageBounds.height;

		// ��ũ�ѹ��� �� ũ�� ������Ʈ
		hBar.setThumb((int) (hRatio * imageBounds.width));
		vBar.setThumb((int) (vRatio * imageBounds.height));

		// ��ũ�ѹ� �󿵿� Ŭ���� 10% ������ �̵��ϵ��� ����
		hBar.setPageIncrement((int) (imageBounds.width * 0.1));
		vBar.setPageIncrement((int) (imageBounds.height * 0.1));
	}

	public void setImage(Image image) {
		if (this.image == image) {
			return;
		}
		this.image = image;
		updateScrollBars();
		redraw();
	}
}