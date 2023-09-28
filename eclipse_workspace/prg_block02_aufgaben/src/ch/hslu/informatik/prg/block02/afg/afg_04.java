package ch.hslu.informatik.prg.block02.afg;

public class afg_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a = false, b = true, c = true, d = false, v = false; int p = 9, q = 10;
		
		// Ausdruck A
		d = !b;							// d = true
		
		// Ausdruck B
		v = !a || b && d || !c && !b;	// v = false;
		
		// Ausdruck C
		v = a && b && (p++ < q);		// v =		p =		q =
		
		// Ausdruck D
		v = a || b && (p++ < q);		// v =		p =		q =
	}

}
