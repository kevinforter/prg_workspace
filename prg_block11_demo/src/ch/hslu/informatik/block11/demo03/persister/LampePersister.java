package ch.hslu.informatik.block11.demo03.persister;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import ch.hslu.informatik.block11.demo03.domain.Lampe;

public class LampePersister {

	// TODO - Methode 'writeObjectsToFile' implementieren
	
	public static void writeObject(Object obj, String fileName) throws FileNotFoundException, IOException {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(obj);
		}
	}

	// TODO - Methode 'readObjectsFromFile' implementieren
	public static List<Lampe> readObjects(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		List <Lampe> liste = null;
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			liste = (List<Lampe>) ois.readObject();
		}
		return liste != null ? liste : new ArrayList<Lampe>();
	}
}
