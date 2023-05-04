package ch.hslu.informatik.prg.block01.demos;

import java.util.Scanner;
public class KreisCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double radius = 0;
		double umfang = 0;
		double flaeche = 0;
		
		System.out.print("Radius eingeben: ");
		
		radius = sc.nextDouble();
		
		//flaeche = radius * radius * 3.14159;
		flaeche = Math.pow(radius, 2) * Math.PI;
		umfang = 2 * radius * Math.PI;
		
		System.out.println("Radius: " + radius);
		System.out.println("Flaeche: " + flaeche);
		System.out.println("Umfang: " + umfang);
	}
}
