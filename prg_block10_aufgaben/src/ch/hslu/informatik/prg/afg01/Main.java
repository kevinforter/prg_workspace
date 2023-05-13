package ch.hslu.informatik.prg.afg01;



public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int value = Util.getIntZahl("Bitte eine Zahl eingeben: ");
		
		int fact = 0;
		try {
			fact = Calculator.getFactorial(value);
		} catch (ArgumentOutOfRangeException e) {
			System.out.println("Caught the exception");
			System.out.println("Exception occured: " + e);
		}

		System.out.println(fact);
	}
}
