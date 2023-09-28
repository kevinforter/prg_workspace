package ch.hslu.informatik.prg.block5.demo;

public class Regal {

	private int regalNummer;
	private double regalHoehe;
	private double regalBreite;
	private double regalTiefe;
	
	public Regal() {
		
	}
	
	public Regal(int regalNummer, double regalHoehe, double regalBreite, double regalTiefe) {
		this.regalNummer = regalNummer;
		this.regalHoehe = regalHoehe;
		this.regalBreite = regalBreite;
		this.regalTiefe = regalTiefe;
	}
	
	public int getRegalNummer() {
		return regalNummer;
	}
	
	public void setRegalNummer(int regalNummer) {
		this.regalNummer = regalNummer;
	}
	
	public double getHoehe() {
		return regalHoehe;
	}
	
	public void setHoehe(double regalHoehe) {
		this.regalHoehe = regalHoehe;
	}
	
	public double getBreite() {
		return regalBreite;
	}
	
	public void setBreite(double regalBreite) {
		this.regalBreite = regalBreite;
	}
	
	public double getTiefe() {
		return regalTiefe;
	}
	
	public void setTiefe(double regalTiefe) {
		this.regalTiefe = regalTiefe;
	}
	
}
