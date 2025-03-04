# Installation von Visual Studio Code

Visual Studio Code (VS Code oder auch einfach Code genannt) ist ein auf den ersten Blick einfacher aber durchaus sehr mächtiger Code Editor für alle gängigen Betriebssysteme und Programmiersprachen. Von Haus aus wird JavaScript (mit NodeJS) unterstützt, aber es gibt sogenannte Extensions für alle gängigen Programmiersprachen.


## Download

Laden Sie bitte den entsprechenden Installer für Ihr System von der [VSCode Download Website](https://code.visualstudio.com/Download){:target="_blank"} und installieren Sie VSCode entsprechend der Installationsanleitung oder folgen Sie den Anweisung des Installers.

![VS Code Download Page](./images-vscode/code-download-page.png)


## Vorbereiten das Entwickeln mit Java

Bitte schauen Sie, dass Sie das JDK schon installiert haben befor Sie diesen Schritt ausführen.

Das [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) ist eine Sammlung von nützlichen Tools um in VSCode Java zu programmieren. Diese Extension sollte sich ohne Probleme installieren lassen. Sollten wider Erwarten Probleme auftauchen, schauen Sie doch bitte ob Ihnen diese [Anleitung](https://code.visualstudio.com/docs/languages/java) weiter helfen kann.


## Die Sprache von VS Code ändern

Visual Studio Code enthält von Haus aus nur Unterstützung für Englisch, um den Editor auf Deutsch nutzen zu können, befolgen Sie bitte folgende Schritte:

1. Öffnen Sie bitte das "Extension Fenster" durch drücken von Ctrl-Shift-X oder durch drücken des entsprechenden Knopf, links in der Menübar.

2. Tippen Sie in das nun sichtbare Such-Feld: "german language". 

3. Dannach sollte als erster Eintrag in den Suchresultaten das "German Language Pack for VS Code" stehen, drücken Sie den grün hinterlegten "Install" Button.

![Sprache Installieren Screenshot](./images-vscode/code-install-language-pack.png)

4. Sobald die Extension (Das Sprachpacket) installiert wurde, erscheint unten rechts im Editor die Frage ob Sie die "UI language" auf Deutsch stellen möchten: Drücken Sie "Yes".

![Sprache Installieren Screenshot](./images-vscode/change-language-notification.png)

5. Dannach werden Sie aufgefordert, den Editor neu zu starten. Dieser sollte nach dem Neustart in Ihrer gewünschten Sprache erscheinen.

## Nützliche Tricks

1. Ctrl+Shift+P öffnet eine Eingabefeld um verschiedene Sachen zu suchen.
1. Wenn Sie Probleme mit Java haben, dann suchen Sie nach `Java: Configure Java Runtime` um ein Dialogfenster zu öffnen mit mehr Informationen zu Ihrer Java Installation.
1. Sie können über das Menu `Terminal` eine Konsole öffnen im Ordner den Sie mit VS Code bearbeiten. Dort sollten die Befehle `javac` und `java` auch funktionieren.