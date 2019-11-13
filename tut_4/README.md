## Installation von Use

Ladet euch [Use](https://sourceforge.net/projects/useocl/) hier runter.
Anschließend könnt ihr die File entpacken mit folgendem Befehl:

```bash
tar -xvzf use-5.1.0.tar.gz
```

Anschließend navigiert in den folgenden Ordner:
```bash
cd use-5.1.0/bin
```

Dort befindet sich die use Datei, die ihr dann ausführen könnt.


## History in OCL Command line unter Linux

Installiert euch dafür rlwrap mit eurem Package manager. Anschließend startet use dann mit folgenden Befehl:
```bash
rlwrap -c use
```

Nun könnt ihr die Pfeiltasten verwenden, um vorherige eingegebene Commands auszuwählen.

## OCL Werte in der Konsole
Um OCL Ausdrücke in der Konsole auszuwerten und nicht in der GUI, müsst ihr immer ein *?* vor den Ausdruck setzen:
```bash
use> ? f1.kunde.name
```
