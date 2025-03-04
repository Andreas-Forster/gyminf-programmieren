
# Jupyter-Notebooks mit Java-Kernel

Jupyter-Notebooks sind eine Webanwendung, die es ermöglicht Programme in einem Webbrowser zu schreiben, zu kommentieren und auszuführen. 
Jupyter Notebooks wurden ursprünglich für Python geschrieben, sind aber inzwischen auch für andere Programmiersprachen verfügbar.
Seit kurzen besteht auch die Möglichkeit, Jupyter Notebooks mit Java zur nutzen.
Dazu müssen Sie zuerst Jupyter Notebooks und danach manuell den IJava Kernel installieren. 
 
Um Jupyter Notebooks zu installieren, haben Sie die Wahl zwischen einer "grossen" Installation oder einer "kleinen".
Die grosse ist etwas einfacher zu installieren, benötigt jedoch ca. 3GB Platz auf Ihrem Computer und basiert auf Anaconda, die kleinere basiert auf Miniconda und kommt mit ca. 400MB Platz aus.
In der Funktionalität unterscheiden sich die zwei Varianten nicht.

Sie brauchen aber nicht zwingend eine eigene Installation von Jupyter-Notebooks. Sie können auch einfach mit [Google Colab](./jupyter-colab.md) arbeiten. Dies setzt jedoch ein Google-Konto voraus um sich anzumelden.

## Lokale Installation

Installieren Sie als erstes Jupyter Notebooks mit einer der zwei Optionen:

1. Anaconda (3GB) - Folgen Sie dafür folgender [Anleitung](https://jupyter.readthedocs.io/en/latest/install/notebook-classic.html).
1. Miniconda (500MB):
    1. installieren Sie Miniconda mit folgender [Anleitung](https://conda.io/projects/conda/en/latest/user-guide/install/index.html#regular-installation)
    1. Öffnen Sie die Anaconda-Konsole (unter Linux und OS X ein normales Terminal).
    1. Führen Sie den Befehl `conda install jupyter` aus.

Nach der erfolgreichen Jupyter Notebook Installation müssen Sie noch den IJava Kern installieren.

1. Laden Sie dazu dieses [Zip-File](https://github.com/SpencerPark/IJava/releases/download/v1.3.0/ijava-1.3.0.zip) herunter.
1. Entpacken Sie das Zip-File.
1. Öffnen Sie eine Anaconda-Konsole (unter Linux und OS X ein normales Terminal).
1. Wechseln Sie mit Hilfe von `cd` (change directory) in das entpackte Verzeichnis.
1. Führen sie den Befehl `python install.py` aus. 

Falls Sie die Notebooks als Präsentationen darstellen können möchten, benötigen Sie zusätzlich die RISE extension. 
Installieren Sie diese gemäss [dieser Anleitung](https://rise.readthedocs.io/en/maint-5.6/installation.html).

Wenn Sie Jupyter-Notebooks starten, sollten Sie beim Erstellen eines neuen Notebooks nun den Java-Kernel auswählen können. 

## Kopieren der Notebooks und Bilder

Nach dem Starten von Jupyter-Notebooks können Sie die Notebooks die wir für die Vorlesung vorbereitet haben in Ihre Jupyter-Umgebung kopieren. 
Öffnen Sie dafür die entsprechenden Notebooks von [hier](../notebooks.md) und laden diese im Anschluss herunter. Dann uploaden Sie 
das Notebook in Ihre Jupyter Umgebung indem Sie den Upload Button drücken.

Download
![jupyter-download](images-jupyter/notebook-download.png)

Upload
![jupyter-upload](images-jupyter/upload.png)

Einige der Notebooks enthalten Bilder. Sie können diese [hier](https://drive.switch.ch/index.php/s/Qc6uwoe9GrySYxq/download) als Zip-File herunterladen. Laden Sie das gesamte Zip File 
in Ihre Notebook Umgebung. Um das Zip-File zu entpacken öffnen Sie in der Jupyter-Umgebung ein Terminal (siehe Bild unten) und führen dann den Befehl
```
unzip -n images.zip
``` 
aus. 

![jupyter-terminal](images-jupyter/jupyter-terminal.png)

