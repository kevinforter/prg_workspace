package ch.hslu.informatik.prg.block05.afg02;

public class Schalter {

	private boolean eingeschaltet;
	
	public void ein() {
	
		if (!eingeschaltet) {
			eingeschaltet = true; 
		}
	}
	
	public void aus() { 
		if (eingeschaltet){
			eingeschaltet = false; 
		}
	}
	
	public boolean isEingeschaltet() { 
		return eingeschaltet;
	}
	
}
