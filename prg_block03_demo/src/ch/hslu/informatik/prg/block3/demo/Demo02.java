package ch.hslu.informatik.prg.block3.demo;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[10];
		arr[0] = "Montag";
		arr[1] = "Dienstag";
		arr[2] = "Mittwoch";
		arr[3] = "Donnerstag";
		arr[4] = "Freitag";
		arr[5] = "Samstag";
		arr[6] = "Sonntag";
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == null) {
				break;
			}
			
			System.out.println(arr[i]);
		}
	}

}
