package ch.hslu.informatik.prg.demo01;

public class Auto implements Beweglich{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Auto startet ...");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Auto stopt ...");
		
	}

	@Override
	public void aendereRichtung(int grad) {
		// TODO Auto-generated method stub
		System.out.println("Auto aendert Richtung ...");
		
	}

	@Override
	public void aendereGeschwindigkeit(double delta) {
		// TODO Auto-generated method stub
		System.out.println("Auto aendert Geschwindigkeit ...");
		
	}
}
