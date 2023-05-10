package ch.hslu.informatik.prg.block05.afg01;

import ch.hslu.informatik.prg.block05.afg02.Schalter;

public class Lampe {

	private double spannung;
	private double leistung;
	private String fassungTyp;
	private Schalter schalter;
	
	public Lampe() {
		
	}
	
	public Lampe(double spannung, double leistung, String fassungTyp, Schalter schalter) {
		this.spannung = spannung;
		this.leistung = leistung;
		this.fassungTyp = fassungTyp;
	}
	
	public double getSpannung() {
		return spannung;
	}
	
	public void setSpannung(double spannung) {
		this.spannung = spannung;
	}
	
	public double getLeistung() {
		return leistung;
	}
	
	public void setLeistung(double leistung) {
		this.leistung = leistung;
	}
	
	public String getFassungTyp() {
		return fassungTyp;
	}
	
	public void setFassungTyp(String fassungTyp) {
		this.fassungTyp = fassungTyp;
	}
	
	public Schalter getSchalter() {
		return schalter;
	}
	
	public void setSchalter(Schalter schalter) {
		this.schalter = schalter;
	}

}
