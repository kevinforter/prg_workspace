package ch.hslu.informatik.prg.block3.demo;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arrA = new int [6];
//		int[] arrB = {2, 4, 6, 8};
		
		double[] noten = {4.2, 5.3, 1.4, 6.0, 3.4, 3.7};
		double summe = 0;
		
		// Berechnung
		
//		double summe = (noten[0] + noten[1] + noten[2] + noten[3] + noten[4] + noten[5]);
//		
//		for (double n : noten) {
//			summe += n;
//		}
		
		for (int i = 0; i < noten.length; i++) {
			summe += noten[i];
		}
		
		
		double dNote = summe / noten.length;
		// Ausgabe
		System.out.println(dNote);
	}

}
