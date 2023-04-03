package ch.hslu.informatik.prg.project.g12;

import ch.hslu.prg.leds.proxy.LedService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LedService service = new LedService();
		service.addLeds(100);
		service.turnLedOn(2);
		//forgit
	}

}
