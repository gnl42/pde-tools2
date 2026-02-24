package me.glindholm.pdetools2.clipboard;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.PropertyPage;

import me.glindholm.pdetools2.clipboard.internal.OpenJavaElementFunction;
import me.glindholm.pdetools2.clipboard.internal.OpenResourceFunction;
import me.glindholm.pdetools2.model.pdetools.ClipboardEntry;

public class ClipEntryPropertyPage extends PropertyPage{

    @Override
    protected Control createContents(Composite parent) {
        Browser browser = new Browser(parent, SWT.FLAT | SWT.BORDER);

        new OpenResourceFunction(browser);
        new OpenJavaElementFunction(browser);

        ClipboardEntry entry = (ClipboardEntry) getElement().getAdapter(ClipboardEntry.class);
        ClipEntryInformationGenerator generator = new ClipEntryInformationGenerator();
        String content = generator.generate(entry).toString();
        browser.setText(content);
        return browser;
    }
}
