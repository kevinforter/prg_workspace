package ch.hslu.informatik.prg.block5.demo;

public class RegalTest {

	public static void main(String[] args) {
		
		Regal regalA = new Regal();
		Regal regalB = new Regal();
		
		regalA.setRegalNummer(17);
		regalA.setHoehe(2.2);
		
		
		regalB.setRegalNummer(33);
		regalB.setHoehe(1.8);
		regalB.setBreite(0.75);
		regalB.setTiefe(0.4);
		
		System.out.println(regalB.getRegalNummer());
		
		Regal regalC = new Regal(44, 2.5, 1.2, 0.6);
		
		System.out.println(regalC.getRegalNummer());
		
		
		
	}
	
}
