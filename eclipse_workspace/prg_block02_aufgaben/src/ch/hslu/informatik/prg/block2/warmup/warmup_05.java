package ch.hslu.informatik.prg.block2.warmup;

public class warmup_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = false;
		int x = 5;
		int y = 10;
		int z = 100;

		// Resultat (res) berechnen
		boolean resA = a && x < y && x * y < z; 
		boolean resB = a && x < y && x * y < z;
		int resC = x > y ? 1000 : 2000;
		
		System.out.println(resA);
		System.out.println(resB);
		System.out.println(resC);
		
		
	}

}
