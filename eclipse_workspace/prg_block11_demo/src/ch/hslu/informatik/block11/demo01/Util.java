package ch.hslu.informatik.block11.demo01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {

	// Methode 'writeWithFileWriter' implementieren (F12)
	public static void writeWithFileWriter(String content, String fileName) throws IOException{
		try(FileWriter writer = new FileWriter(fileName, true)) {
			writer.write(content);
		}
	}
	
	// Methode 'writeWithBufferedWriter' implementieren (F14)
	public static void writeWithBufferedWriter(String fileName)  throws IOException{
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write("Guten Morgen");
			writer.newLine();
			
			writer.write("Heute werden Strings in Java behandelt!");
			writer.newLine();
			writer.newLine();
			
			writer.write("Mal sehen, ob es funktioniert....");
			writer.newLine();
		}
	}

	// Methode 'readWithFileReader' implementieren (F16)
	public static String readWithFileReader(String path) throws IOException {
		StringBuilder sBuilder = new StringBuilder();
		int n = -1;
		
		try(FileReader reader = new FileReader(path)) {
			while((n = reader.read()) != -1) {
				sBuilder.append((char)n);
			}
		}
		return sBuilder.toString();
	}

	// Methode 'readWithBufferedReader' implementieren (F18)
	public static String readWithBufferedReader(String fileName) throws IOException {
		StringBuilder sBuilder = new StringBuilder();
		
		try(BufferedReader bReader = new BufferedReader(new FileReader(fileName))) {
			String line = "";
			
			while((line = bReader.readLine()) != null) {
				sBuilder.append(line).append("\n");
			}
		}
		
		return sBuilder.toString();
	}
}
