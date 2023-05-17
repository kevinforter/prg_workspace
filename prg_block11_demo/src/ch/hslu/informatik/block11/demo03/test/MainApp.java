package ch.hslu.informatik.block11.demo03.test;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import org.apache.logging.log4j.*;

import ch.hslu.informatik.block11.demo03.domain.Lampe;
import ch.hslu.informatik.block11.demo03.persister.LampePersister;

public class MainApp {

	private static final Logger LOGGER = LogManager.getLogger(MainApp.class);
	
	public static void main(String[] args) {
		// TODO - Methoden der Klasse 'LampePersister' testen
		
		List<Lampe> list = new ArrayList<>();
		
		list.add(new Lampe (230, 60, "ABC"));
		
		try {
			LampePersister.writeObject(list, "/Users/kevinforter/Documents/lampe.obj");
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
			System.out.println("Es ist leider ein Fehler passiert");
		}
	}
	
}
