package ch.hslu.informatik.prg.afg01;

public class Calculator {
	
	public static void justThrowException() throws ArgumentOutOfRangeException{
        throw new ArgumentOutOfRangeException("Arugument was out of Range");
    }

	public static int getFactorial (int input) {

		int i;
		for(i=1;i<=input;i++) {
			i *= i;
		}

		do {
			try {
				i = Calculator.getFactorial(input);
				justThrowException();
			} catch (ArgumentOutOfRangeException e){
				System.out.println("Die Zahl muss zwischen 0 und 19 sein");
			} 
		} while (input == 0 && input <= 19);

		return i;
	}
}