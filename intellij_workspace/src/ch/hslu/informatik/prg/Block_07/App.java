package ch.hslu.informatik.prg.Block_07;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		/*
		 * Mitarbeiter, der für die Organisation und Durchchführung zuständig ist
		 * (eventOwner)
		 */
		Person eventOwner = new Person("Pfister", "Max", "mpfister@gmx.ch");

		Event javaNeuerungen = new Event("Java 9 - Neuerungen", "Einführung in Java 9", "Rösslimatte 52, Luzern",
				LocalDate.of(2017, 8, 30), LocalTime.of(18, 0), 180, eventOwner);

		EventManager eManager = new EventManager();

		eManager.eventOrganisieren(javaNeuerungen);

		System.out.println();
		for(Teilnehmer t : javaNeuerungen.getTeilnehmerListe()) {
			System.out.println(t);
		}

		System.out.print("\nE-Mail für löschen Teilnehmer: ");
		email = sc.next();

		for(Teilnehmer t : javaNeuerungen.getTeilnehmerListe()) {
			if (t.getEmail().equals(email)) {
				javaNeuerungen.teilnehmerEntfernen(email);
				break;
			}
		}

		System.out.println();
		for(Teilnehmer t : javaNeuerungen.getTeilnehmerListe()) {
			System.out.println(t);
		}

		System.out.println();
		for(Uebersetzer u : javaNeuerungen.getUebersetzerListe()) {
			System.out.println(u);
		}

		System.out.print("\nE-Mail für löschen Uebersetzer: ");
		email = sc.next();

		for(Uebersetzer u : javaNeuerungen.getUebersetzerListe()) {
			if (u.getEmail().equals(email)) {
				javaNeuerungen.uebersetzerEntfernen(email);
				break;
			}
		}

		System.out.println();
		for(Uebersetzer u : javaNeuerungen.getUebersetzerListe()) {
			System.out.println(u);
		}
	}

}
