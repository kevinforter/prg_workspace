package ch.hslu.informatik.prg.block09.demo01;

public class Board {

	private int breite;
	private int hoehe;
	
	public Board () {
		
	}
	
	public Board (int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public int getHoehe() {
		return hoehe;
	}

	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}

	@Override
	public String toString() {
		return "Board [breite=" + breite + ", hoehe=" + hoehe + "]";
	}
	
	
}
