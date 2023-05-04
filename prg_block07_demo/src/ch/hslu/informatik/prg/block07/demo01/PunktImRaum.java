package ch.hslu.informatik.prg.block07.demo01;

public class PunktImRaum {

	private int x;
	private int y;
	private int z;

	public PunktImRaum() {

	}

	public int getX() {
		return x;
	}
	
	public PunktImRaum(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y + ", z = " + z;
	}

}
