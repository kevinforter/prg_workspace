package ch.hslu.informatik.prg.demo01;

public class Schiff implements Beweglich{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Schiff startet ...");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Schiff stopt ...");
		
	}

	@Override
	public void aendereRichtung(int grad) {
		// TODO Auto-generated method stub
		System.out.println("Schiff aendert Richtung ...");
		
	}

	@Override
	public void aendereGeschwindigkeit(double delta) {
		// TODO Auto-generated method stub
		System.out.println("Schiff aendert Geschwindigkeit ...");
		
	}
}
