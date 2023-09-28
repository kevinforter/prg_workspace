package ch.hslu.informatik.prg.block06.demo01;

public class Lastwagen extends KraftFahrzeug{

	private double nutzLast;
	
	public Lastwagen (int fahrzeugNummer, double leerGewicht, int leistung, double nutzLast) {
		super(fahrzeugNummer, leerGewicht, leistung);
		this.nutzLast = nutzLast;
	}

	public double getNutzLast() {
		return nutzLast;
	}

	public void setNutzLast(double nutzLast) {
		this.nutzLast = nutzLast;
	}
	
	public String toString() {
		return super.toString() + ", Nutzlast: " + nutzLast;
	}
}
