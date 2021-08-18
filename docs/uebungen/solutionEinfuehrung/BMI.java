public class BMI { 

    public static void main(String[] args) {

        // Schreiben Sie hier ihren Code

        // zuerst weisen wir die zwei Zahlen von der Kommandozeile ein Variablen zu (Hinweise aus der Aufgabe)
        double cm = Double.parseDouble(args[0]);
        double kg = Double.parseDouble(args[1]);

        // dann berechnen wir den BMI
        double meter = cm/100;
        double BMI = kg/(meter*meter);

        // wir bereiten den Text vor
        String prefix = "Ihr BMI beträgt: ";
        String lower = "Sie haben einen BMI unter 20.";
        String between  = "Sie haben einen BMI zwischen 20 und 25.";
        String above = "Ihr BMI ist über 25.";

        // nun geben wir noch den entsprechenden Text aus
        System.out.println(prefix+BMI);
        if (BMI < 20 ) {
            System.out.println(lower);
        } else if ( BMI > 25) {
            System.out.println(above);
        } else {
            System.out.println(between);
        }

    }
}