package ch.hslu.informatik.prg.block05.afg01;

import ch.hslu.informatik.prg.block05.afg02.Schalter;

public class LampeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lampe lampeA = new Lampe();
		// TODO - Spannung (24 V), Leistung (40 W) und Fassung-Typ (E14) setzen
		lampeA.setSpannung(24);
		lampeA.setLeistung(40);
		lampeA.setFassungTyp("E14");
		Schalter schalterA = new Schalter(); // Schalter für Lampe A erstellen
		lampeA.setSchalter(schalterA); // Schalter für Lampe A setzen
		
		// TODO - Spannung und Leistung der ’lampeA’ ausgeben 
		System.out.println("Spannung: " + lampeA.getSpannung() + " V " + "Leistung: " + lampeA.getLeistung() + " W " + "Fassung-Typ: " + lampeA.getFassungTyp());
		
		// TODO - lampeB erstellen und mit benutzerdefiniertem Konstruktor initalisieren
		Schalter schalterB = new Schalter();
		Lampe lampeB = new Lampe(220, 80, "E24", schalterB);
		
		// TODO - Spannung, Leistung und Fassung-Typ der ’lampeB’ ausgeben
		System.out.println("Spannung: " + lampeB.getSpannung() + " V " + "Leistung: " + lampeB.getLeistung() + " W " + "Fassung-Typ: " + lampeB.getFassungTyp());

		// TODO - Lampen ein und ausschalten
		schalterA.ein(); // Lampe A einschalten
		schalterB.ein(); // Lampe B einschalten
		
		if (schalterA.isEingeschaltet() == true && schalterB.isEingeschaltet() == true) {
			System.out.println("Lampe A: Eingeschalten");
			System.out.println("Lampe B: Eingeschalten");
		}

		schalterA.aus(); // Lampe A ausschalten
		schalterB.aus(); // Lampe B ausschalten
		if (schalterA.isEingeschaltet() != true && schalterB.isEingeschaltet() != true) {
			System.out.println("Lampe A: Ausgeschalten");
			System.out.println("Lampe B: Ausgeschalten");
		}
		
		
	}

}
