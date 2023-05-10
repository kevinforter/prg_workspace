package ch.hslu.informatik.prg.block06.demo01;

public class Fahrzeug {

	private int fahrzeugNummer;
	private double leerGewicht;
	
	// zu Klasse Object
	public Fahrzeug() {
		
	}
	
	public Fahrzeug(int fahrzeugNummer, double leerGewicht) {
		this.fahrzeugNummer = fahrzeugNummer;
		this.leerGewicht = leerGewicht;
	}

	public int getFahrzeugNummer() {
		return fahrzeugNummer;
	}

	public void setFahrzeugNummer(int fahrzeugNummer) {
		this.fahrzeugNummer = fahrzeugNummer;
	}

	public double getLeerGewicht() {
		return leerGewicht;
	}

	public void setLeerGewicht(double leerGewicht) {
		this.leerGewicht = leerGewicht;
	}

	public String toString() {
		return "Fahrzeug-Nr: " + fahrzeugNummer + ", Leer-Gewicht: " + leerGewicht;
	}
}
