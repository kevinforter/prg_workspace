package ch.hslu.informatik.prg.block05.afg05;

public class Buch {

	private int buchNummer; 
	private String titel; 
	private String autor; 
	private int erscheinungJahr;
	private int auflage;
	
	public Buch() { 
		
	}
	
	public Buch(int buchNummer , String titel , String autor , int erscheinungJahr , int auflage) {
	this.buchNummer = buchNummer; 
	this.titel = titel;
	this.autor = autor; 
	this.erscheinungJahr = erscheinungJahr; 
	this.auflage = auflage;
	}
	
	// set- und get-Methoden ...
	
}
