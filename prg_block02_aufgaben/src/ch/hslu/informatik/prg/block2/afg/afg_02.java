package ch.hslu.informatik.prg.block2.afg;

import java.util.Scanner;

public class afg_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variablen
		double startKapital;
		double zinssatz;
		int anzahlJahre;

		/* Scanner erstellen */
		Scanner sc = new Scanner(System.in);
		
		/* Startkapital einlesen */
		System.out.print("Bitte Startkapital eingeben:" ); 
		startKapital = sc.nextDouble();
		
		/* Zinssatz einlesen */
		System.out.print("Bitte Zinssatz in Prozent eingeben:" );
		zinssatz = sc.nextDouble();
		
		/* Anzahl Jahre einlesen */
		System.out.print("Bitte Anzahl Jahre eingeben:" ); 
		anzahlJahre = sc.nextInt();
		
		/* Endkapital berechnen und Ausgeben */
		double endKapital = startKapital * Math.pow((1 + zinssatz / 100), 
				anzahlJahre);
		System.out.println("\nEndkapital:" + endKapital);
		
		
	}

}
