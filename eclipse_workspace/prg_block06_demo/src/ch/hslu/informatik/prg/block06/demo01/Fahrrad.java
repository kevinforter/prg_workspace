package ch.hslu.informatik.prg.block06.demo01;

public class Fahrrad extends Fahrzeug{

	private double ramenHoehe;

	public Fahrrad(int fahrzeugNummer, double leerGewicht, double ramenHoehe) {
		super(fahrzeugNummer, leerGewicht);
		this.ramenHoehe = ramenHoehe;
	}
	
	public double getRamenHoehe() {
		return ramenHoehe;
	}

	public void setRamenHoehe(double ramenHoehe) {
		this.ramenHoehe = ramenHoehe;
	}
	
	public String toString() {
		return super.toString() + ", Ramen-Hoehe: " + ramenHoehe;
	}
}
