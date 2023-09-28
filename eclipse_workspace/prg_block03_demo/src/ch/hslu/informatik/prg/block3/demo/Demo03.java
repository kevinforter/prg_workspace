package ch.hslu.informatik.prg.block3.demo;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[10];
		arr[0] = "Montag";
		arr[3] = "Dienstag";
		arr[4] = "Mittwoch";
		arr[5] = "Donnerstag";
		arr[6] = "Freitag";
		arr[7] = "Samstag";
		arr[8] = "Sonntag";
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == null) {
				continue;
			}
			
			System.out.println(arr[i]);
		}
		
	}

}
