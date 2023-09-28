package ch.hslu.informatik.prg.block06.demo01;

public class PersonenWagen extends KraftFahrzeug{

	private int anzahlPlaetze;
	
	public PersonenWagen () {
		
	}
	
	public PersonenWagen (int fahrzeugNummer, double leerGewicht, int leistung, int anzahlPlaetze) {
		super(fahrzeugNummer, leerGewicht, leistung);
		this.anzahlPlaetze = anzahlPlaetze;
	}

	public int getAnzahlPlaetze() {
		return anzahlPlaetze;
	}

	public void setAnzahlPlaetze(int anzahlPlaetze) {
		this.anzahlPlaetze = anzahlPlaetze;
	}
	
	public String toString() {
		return super.toString() + ", anzahl-Plaetze: " + anzahlPlaetze;
	}
}
