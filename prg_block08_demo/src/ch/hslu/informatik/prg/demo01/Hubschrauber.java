package ch.hslu.informatik.prg.demo01;

public class Hubschrauber implements Beweglich{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Hubschrauber startet ...");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Hubschrauber stopt ...");
		
	}

	@Override
	public void aendereRichtung(int grad) {
		// TODO Auto-generated method stub
		System.out.println("Hubschrauber aendert Richtung ...");
		
	}

	@Override
	public void aendereGeschwindigkeit(double delta) {
		// TODO Auto-generated method stub
		System.out.println("Hubschrauber aendert Geschwindigkeit ...");
		
	}
}
