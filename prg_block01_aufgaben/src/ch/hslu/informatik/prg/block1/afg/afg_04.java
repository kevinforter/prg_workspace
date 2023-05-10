package ch.hslu.informatik.prg.block1.afg;

import java.util.Scanner;

public class afg_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variablen
		double guthaben;
		double zinsSatz;
		double zinsen;
		double guthabenMitZinsen;
		
		// Eingabe
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ein Guthaben ein: ");
		guthaben = sc.nextDouble();
		
		System.out.print("Geben Sie einen Zinssatz ein: ");
		zinsSatz = sc.nextDouble();
		
		// Verarbeitung
		guthabenMitZinsen = guthaben * (1 + zinsSatz / 100);
		zinsen = guthabenMitZinsen - guthaben;
		
		// Ausgabe
		System.out.println("Zinsen im ersten Jahr: " + zinsen + "CHF");
		System.out.println("Guthaben nach einem Jahr: " + guthabenMitZinsen + "CHF");
		
	}

}
