package ch.hslu.informatik.prg.block02.afg;

public class afg_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10, y = 20, z = 30; 
		System.out.println("y: " + y++); //20
		System.out.println("z: " + --z); //29
		
		System.out.println(y);
		
		int p = x-- + y-- + --z; 
		System.out.println("p: " + p); //77 -> 59
		
		x = 10;
		y = 133;
		System.out.println(x + "%" + y + " = " + x % y); //0 -> 10
		System.out.println(y + "%" + x + " = " + y % x); //3
		
		int a = 3, b = 8, c = 12, res = 4;
		res += a * b;
		System.out.println("res: " + res); //28
	}

}