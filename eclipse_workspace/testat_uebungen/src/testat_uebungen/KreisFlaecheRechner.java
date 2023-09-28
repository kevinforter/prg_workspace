package testat_uebungen;

import java.util.Scanner;

public class KreisFlaecheRechner {
public static void main(String [] args) { // Radius des Kreises
double radius = 0;
String meldung = "Bitte gebe einen Radius für den Kreis ein:";
// TODO – 'radius' mit Hilfe der Methode 'radiusEinlesen' holen
radius = radiusEinlesen(meldung);
// Die Kreisfläche mit Hilfe der Methode 'kreisflaeche' berechnen 
double flaeche = kreisflaeche(radius);
// TODO – Radius und die berechnete Kreisfläche mit Hilfe der Methode 
// ' kreisdatenAnzeigen ' ausgeben
kreisdatenAnzeigen(radius, flaeche);
}
/* Methode 'radiusEinlesen' */
public static double radiusEinlesen (String meldung) {
	Scanner sc = new Scanner(System.in); System.out.print(meldung);
return sc.nextDouble();
}
// TODO – Methode 'kreisflaeche' implementieren - Klassenmethoden
public static double kreisflaeche (double radius) {
	double flaeche = radius * radius * 3.14;
	return flaeche;
}
/* Methode 'kreisdatenAnzeigen' */
public static void kreisdatenAnzeigen (double kRadius, double kFlaeche) {
	System.out.println("Radius: " + kRadius + ", Flaeche: " + kFlaeche); }
}
