package ch.hslu.informatik.prg.block06.afg02;

public class Lehrling extends Mitarbeiter {

    private static final double erstesJahr = 0.15;
    private static final double zweitesJahr = 0.25;
    private static final double drittesJahr = 0.3;

    @Override
    public double berechneLohn() {

        // Erstes Jahr  -> Lohn = grundLohn * 0.15
        // Zweites Jahr -> Lohn = grundLohn * 0.25
        // Drittes Jahr -> Lohn = grundLohn * 0.3

        double lehrJahr = currentYear - getJahrEinstellung();

        if (lehrJahr <= 1 ) {
            double lohn = grundLohn * erstesJahr;
            return lohn;
        } else if (lehrJahr <= 2 && lehrJahr > 1) {
            double lohn = grundLohn * zweitesJahr;
            return lohn;
        } else {
            double lohn = grundLohn * drittesJahr;
            return lohn;
        }

    }
}
