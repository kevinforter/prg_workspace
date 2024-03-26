package Block_04.Aufgaben.afg_03;

public class FlaecheRechner {
    public static void main(String[] args) {

        /* Radius */
        double radius = 5;

        /* Seitenlaenge eines Quadrats */
        int seiteLaenge = 10;

        /* Breite und Hoehe eines Rechteck */
        int breite = 25, hoehe = 4;

        /* Kriesflaeche berechnen */
        double flaecheKreis = FlaecheRechner.berechneFlaeche(radius);

        /* Qudratflaeche berechnen */
        double flaecheQuadrat = FlaecheRechner.berechneFlaeche(seiteLaenge);

        /* Rechteckflaeche berechnen */
        long flaecheRechteck = FlaecheRechner.berechneFlaeche(breite , hoehe);

        /* Ausgaben */
        System.out.printf("Kreisflaeche: %8.2f\n", flaecheKreis);
        System.out.printf("Quadratflaeche:%8.2f\n", flaecheQuadrat);
        System.out.println("Rechteckflaeche: " + flaecheRechteck);
    }

     static double berechneFlaeche (double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    static double berechneFlaeche (int seiteLaenge) {
        return Math.pow(seiteLaenge, 2);
    }

    static long berechneFlaeche (int breite, int hoehe) {
        return (long) breite * hoehe;
    }
}
