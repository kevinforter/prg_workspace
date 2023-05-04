package ch.hslu.informatik.prg.block2.afg;

import java.util.Scanner;

public class afg_01 {
	
	public static void main(String[] args) {

		// Variablen
		double maschinenLeistung = 0;
		double stueckZahl = 0;
		double zeitlicherAufwand = 0;
		double maschinenKosten = 0;
		double lohnKosten = 0;
		double auftragsKosten = 0;
		double gesamtKosten = 0;
		
		// Eingabe werte
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie  die Maschinenleistung (Stuecke/Stunde) ein: ");
		maschinenLeistung = sc.nextDouble();
		
		System.out.println("Bitte geben Sie  die gwünschte Stueckzahl ein: ");
		stueckZahl = sc.nextInt();
		
		System.out.println("Bitte geben Sie  die Maschinenkosten ein: ");
		maschinenKosten = sc.nextInt();
		
		System.out.println("Bitte geben Sie  die Lohnkosten ein: ");
		lohnKosten = sc.nextInt();
		
		System.out.println("Bitte geben Sie  die fixen Auftragskosten ein: ");
		auftragsKosten = sc.nextInt();
		
		// Berechnung
		zeitlicherAufwand = stueckZahl / maschinenLeistung;
		gesamtKosten = auftragsKosten + maschinenKosten * zeitlicherAufwand + lohnKosten * zeitlicherAufwand;
		
		if (stueckZahl < 100) {
			gesamtKosten = gesamtKosten + gesamtKosten * 0.2;
		}
		
		// Ausgabe
		System.out.println("Der zeitliche Aufwand beträgt: " + zeitlicherAufwand + " Stunden");
		System.out.println("Die Kosten betragen: " + gesamtKosten);
	}
}
