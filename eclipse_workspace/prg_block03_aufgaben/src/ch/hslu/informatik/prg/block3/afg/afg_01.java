package ch.hslu.informatik.prg.block3.afg;

import java.util.Scanner;

public class afg_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Startkapital eingeben: ");
		double startKapital = sc.nextDouble();
		
		System.out.print("Anzahl Jahre eingeben: "); 
		double anzahlJahre = sc.nextDouble();
		
//		System.out.print("Zinssatz in Prozent eingeben: "); 
//		double zinsSatzInProzent = sc.nextDouble();
		
		double zinsSatzInProzent;
		
		if (startKapital < 10000) {
			zinsSatzInProzent = 0.75;
		} else if (startKapital >= 10000 && startKapital < 100000){
			zinsSatzInProzent = 0.5;
		} else {
			zinsSatzInProzent = 0.25;
		}
		
		/* Endkapital berechnen und Ausgeben */
		double endKapital = startKapital * Math.pow((1 + zinsSatzInProzent / 100), anzahlJahre);
		System.out.println("\nEndkapital: " + endKapital); 
		

	}

}
