# CustomUUID Plugin for Oxygen XML Editor

A [Workspace Access Plugin](http://www.oxygenxml.com/doc/ug-oxygen/index.html#concepts/workspace-access-plugin.html) for Oxygen XML Editor that creates TEI-conform UUIDs starting with a letter.

### Version
1.0.0

### Installation and Requirements

Needs Oxygen XML Editor version 16.1 or higher.

This Oxygen Workspace Access Plugin automatically resolves the custom editor variable `${customUUID}` in a UUID that starts with a letter.

IMPORTANT: So far only *one* UUID will be generated. If you are creating a file with more than one occurrence of this editor variable, all occurrences will be resolved in the *same* UUID.

A custom editor variable can be configured in the Oxygen *Preferences* page. For further information see the [Oxygen docs](http://www.oxygenxml.com/doc/ug-editor/#topics/custom-editor-variables.html).

*Local Usage:*
- navigate to Oxygen folder
- in folder */plugins* create a new folder *oxygen-plugin-customUUID* and add the file `plugin.xml`
- in the Oxygen folder go to */lib* directory and add the file `oxygen-plugin-customUUID-1.0.jar`

*Add-on:*

The following files are need for a deployment as an add-on:

- `oxygen-plugin-customUUID-1.0-plugin.jar`
- `extension.xml` for the update site, fill in the update site URL
- for further information see the [Oxygen help page](http://www.oxygenxml.com/addons.html).

### Usage

This Oxygen Plugin automatically resolves the custom editor variable `${customUUID}` in a UUID that starts with a letter. It employs an event listener that resolves this editor variable whenever it occurs.

#### Change the plugin

In order to resolve another custom editor variable, the search pattern in class `customUUIDResolver.java` has to be changed.

### License
The MIT License (MIT)

Copyright (c) 2015 Digitales Familiennamenwörterbuch Deutschlands (DFD) at the TU Darmstadt and the Akademie der Wissenschaften und der Literatur Mainz

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
