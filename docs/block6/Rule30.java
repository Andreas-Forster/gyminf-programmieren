class Rule30 {

    // Jedes Java Programm beginnt bei der main-Methode. Wir empfehlen, dass Sie das Programm auch dort zu lesen beginnen.


    // Die print Methode soll für die als Parameter übergebene Linie alle Elemente ausgeben.
    static void print(boolean[] line) {

        // Die Schleife läuft vom ersten Element im Array (von 0 an indexiert) bis zu 1 kleiner als die Länge (deshalb < und nicht <=).
        for( int i = 0; i<line.length ; i = i + 1) {
            // je nach dem Wert des Elements im Array geben wir etwas anderes aus, wollen aber keine neue Zeile.
            if ( line[i] ) {
                System.out.print('#');
            } else {
                System.out.print('.');
            }
        }

        // Nach der Ausgabe des gesamten Arrays gehen wir auf eine neue Zeile.
        System.out.println();
    }

    // Die Funktion berechnet anhand der drei Stellen (third, second, first) einer Binärzahl die entsprechende Dezimalzahl.
    // Bsp. third=true, second=false, first=true => 0b101 => 4 + 1 = 5
    static int calculateNumberFromPattern(boolean third, boolean second, boolean first) {
        int sum = 0;
        if( first) {
            sum += 1; // 2^0 = 1
        }
        if( second ) {
            sum += 2; // 2^1 = 2
        }
        if( third ) {
            sum += 4; // 2^2 = 4
        }
        return sum;
    }

    // Die Funktion update berechnet eine neue Zeile anhand der als Parameter übergebenen Linie und gibt diese an den Aufrufer zurück.
    static boolean[] update(boolean[] current) {

        // Hier wird speicher für die neue Linie angelegt.
        boolean[] next = new boolean[current.length];

        // Die Schleife läuft über alle Elemente des Arrays und berechnet jeweils den Zustand der Zelle auf der neuen Zeile.
        for(int i = 0; i<current.length; i++) {

            // Die Methode calculateNumberFromPattern interpretiert die Zustände der aktuellen Zelle sowie der linken und rechten Nachbarzelle als Binärzahl und berechnet dafür die Dezimalzahl.
            int zahl = calculateNumberFromPattern(
                current[(i-1+current.length)%current.length], // die Zelle links
                current[i],                                   // die aktuelle Zelle
                current[(i+1)%current.length]                 // die Zelle rechts
            );

            // Die Regel, wir testen ob die Zahl einer der Fälle ist für welchen true zurück geben werden sollen.
            next[i] = zahl==1 || zahl==2 || zahl==3 || zahl==4;
        }

        return next;
    }

    // bei der main-Methode beginnt das Java Programm
    public static void main(String[] args) {

         // Um zu sehen, dass das Programm startet geben wir etwas auf die Konsole aus.
        System.out.println("Starting Rule 30!");

        // Wir definieren uns hier unsere Linie als boolean-Array mit einer Länge von 151. Alle Elemente werden als 'false' initialisiert.
        boolean[] line = new boolean[151];

        // Wir setzen das Element in der Mitte auf true.
        line[75] = true;

        // Wir geben die initialisierte Zeile aus. Dafür müssen wir unsere eigene print Methode schreiben (weiter oben).
        print(line);

        // Wir berechnen in einer Schleife jeweils ein update und geben die neue Zeile aus. Für das Update müssen wir unsere eigene Funktion schreiben (weiter oben).
        for(int i = 0; i<75; i += 1) {
            line = update(line);
            print(line);
        }
    }
}