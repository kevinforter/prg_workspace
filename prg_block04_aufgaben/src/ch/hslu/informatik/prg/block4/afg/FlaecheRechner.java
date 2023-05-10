package ch.hslu.informatik.prg.block4.afg;

public class FlaecheRechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Radius */
		double radius = 5;
		
		/* Seitenlaenge eines Quadrats */
		int seiteLaenge = 10;
		
		/* Breite und Hoehe eines Rechteck */
		int breite = 25; int hoehe = 4;
		
		/* Kriesflaeche berechnen */
		double flaecheKreis = FlaecheRechner.berechneFlaeche(radius);
		
		/* Qudratflaeche berechnen */
		double flaecheQuadrat = FlaecheRechner.berechneFlaeche(seiteLaenge);
		
		/* Rechteckflaeche berechnen */
		long flaecheRechteck = FlaecheRechner.berechneFlaeche(breite , hoehe);
		
		/* Ausgaben */
		System.out.printf("Kreisflaeche: %8.2f\n", flaecheKreis); 
		System.out.printf("Quadratflaeche: %8.2f\n", flaecheQuadrat); 
		System.out.println("Rechteckflaeche: " + flaecheRechteck);
	}
	
	public static double berechneFlaeche(double radius){
		double flaeche = radius * Math.PI;
		return flaeche;
	}
	
	public static double berechneFlaeche(int seiteLaenge){
		double flaeche = Math.pow(seiteLaenge, 2);
		return flaeche;
	}

	public static long berechneFlaeche(int breite, int hoehe){
		long flaeche = breite * hoehe;
		return flaeche;
	}
}
