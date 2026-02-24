# pde-tools, Make your Eclipse more AWESOME!
*** Note *** This is a fork of Jeeeyul's PDE-Tools, mainly due to the disappearance of original update site.

From the original repository:
<hr/>
Jeeeyul's PDE-tools provides some cool features for Eclipse Plugin Developers.

It was originated for me and my team. And it works great for me. I hope it helps you too.

* [Release Note](https://github.com/jeeeyul/pde-tools/wiki/Release-Note)
* [Trouble Shoot](https://github.com/jeeeyul/pde-tools/wiki/Trouble-Shoot)

## Features
* [Clipboard History](#clipboard-history)
* [Crazy Outline View](#crazy-outline)
* [Generates Shared Image Constants for Plugin Developments](#shared-image-generator)
* [Icon Previewing Decorator](#icon-preview)
* [Enhanced Clipboard (History feature)](#clipboard-history)
* [Bundle Image Resource Navigator](#bundle-image-navigator)
* [Screenshot tool](#screenshot-tool)
* [Workspace Launcher](#workspace-launcher) **NEW!**

## Install
* Update Site(4.38+): 
```
https://gnl42.github.io/pde-tools2-update
```

If you **updating PDE-Tools**, Please restart your eclipse with -clearPersistedState Options after update. 
see [why](https://github.com/jeeeyul/pde-tools/wiki/Trouble-Shoot)
```bash
eclipse -clearPersistedState
```

## Clipboard History
Just press <kbd>Control</kbd> + <kbd>Shift</kbd> + <kbd>V</kbd> (or <kbd>Control</kbd> + <kbd>Alt</kbd> + <kbd>V</kbd>) instead of <kbd>Control</kbd> + <kbd>V</kbd>, then you can paste contents from history of Clipboard.

![screenshot](https://raw.githubusercontent.com/gnl42/pde-tools2/main/me.glindholm.pdetools2.resource/clipboard-history-paste.png)

It also provides view.

![screenshot](https://raw.githubusercontent.com/gnl42/pde-tools2/main/me.glindholm.pdetools2.resource/clipboard-history-view.png)


## Icon Preview
Icon files are directly showed in Package Explorer or other navigators.

It's fast and light-weight, content change sensitive.

*** Note*** If "File Icons Based On Content Analysis" decorator (Preferences->General->Appearance->Label Decorators) is enabled in Eclipse then Icon Preview won't work

![screenshot](https://raw.githubusercontent.com/gnl42/pde-tools2/main/me.glindholm.pdetools2.resource/icon-preview.png)

## Shared Image Generator
PDE Tools generates Java constants for monitored folder. It also support structured folders as sub palettes.

![screenshot](https://raw.githubusercontent.com/gnl42/pde-tools2/main/me.glindholm.pdetools2.resource/shared-image-generator.png)

1. Select a plugin project and press right mouse button.
2. Select "Configure > Enable Shared Image Generator"
3. That's all.

![screenshot](https://raw.githubusercontent.com/gnl42/pde-tools2/main/me.glindholm.pdetools2.resource/sig-config.png)


## Bundle Image Navigator

![screenshot](https://raw.githubusercontent.com/gnl42/pde-tools2/main/me.glindholm.pdetools2.resource/bundle-image-navigator.png)

You can easily browse image files on plugins, and just drag and drop into your project to reuse icons.

## Crazy Outline
![Crazy Outline](https://raw.githubusercontent.com/gnl42/pde-tools2/main/me.glindholm.pdetools2.resource/crazy-outline.png)

**Crazy Outline View** provides awesome way to navigate your source code.

It supports not only text based editor also support multi-paged editors.

<pre>
Window >> Show View >> Others... >> Plug-in Development >> Crazy Outline
</pre>
or
Just press <kbd>Ctrl</kbd>(or Command) + <kbd>3</kbd> and type crazy.

## Screenshot tool

Use Camera icon or <kbd>Alt</kbd> + <kbd>Shift</kbd> + <kbd>2</kbd> to take screenshots of Eclipse parts.

When you taking snapshot, press Command(or CTRL) then click to make a shot, then you will see, result image is rendered with Windows Aero effect with transparency. 

## Workspace Launcher
![launcher](https://raw.githubusercontent.com/gnl42/pde-tools2/main/me.glindholm.pdetools2.resource/release-note/1.1/workspace-launcher.png)

Now you can launch other workspace rather than switch. It is more useful for MacOSX users.

## License
This software is distributed under the [EPL](https://www.eclipse.org/legal/epl-v10.html)

Basically this license allows almost everything what you want to do including commerical purpose. Read details from [here](https://www.eclipse.org/legal/epl-v10.html).
And It doesn't provide any **Warranties**.
