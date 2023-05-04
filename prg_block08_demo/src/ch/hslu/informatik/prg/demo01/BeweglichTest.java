package ch.hslu.informatik.prg.demo01;

public class BeweglichTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hubschrauber h = new Hubschrauber();
		Auto a = new Auto();
		Schiff s = new Schiff();
		
		h.start();
		a.start();
		s.start();
		
		a.stop();
		s.stop();	
		
		h.aendereRichtung(30);
		h.aendereGeschwindigkeit(0.5);
		
		h.stop();
		
		Beweglich[] arr = new Beweglich[3];
		
		arr[0] = h;
		arr[1] = a;
		arr[2] = s;
		
		for (Beweglich obj : arr) {
			obj.start();
		}
		
		for (Beweglich obj : arr) {
			obj.aendereGeschwindigkeit(2);
		}
		
		for (Beweglich obj : arr) {
			obj.stop();
		}
		
		System.out.println("\n");
		
		Steuerung.starten(a);
		Steuerung.starten(s);
		Steuerung.anhalten(a);
		Steuerung.anhalten(s);
		
		
	}

}
