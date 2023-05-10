package ch.hslu.informatik.prg.demo01;

public interface Beweglich {
	
	void start();
	void stop();
	void aendereRichtung(int grad);
	void aendereGeschwindigkeit(double delta);

}
