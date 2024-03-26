package ch.hslu.informatik.prg.ledProjekt;

import ch.hslu.prg.ledboard.proxy.Led;
import ch.hslu.prg.ledboard.proxy.BoardService;
import ch.hslu.prg.ledboard.proxy.LedColor;

import java.util.Scanner;

public class ClientApp {

    private static final BoardService service = new BoardService();
    private static final Scanner sc = new Scanner(System.in);
    private static final int MAX_ROWS = BoardService.MAX_ROWS;

    public static void main(String[] args) {

        ledsOnOff();

    }

    private static void ledsOnOff() {

        System.out.print("Geben sie die Anzahl hinzuzufügenden LED Reihen an: ");
        int rows = sc.nextInt();

        if (rows > MAX_ROWS) {
            System.out.println("Die Anzahl der Reihen darf nicht größer als 32 sein.");
        } else {
            service.add(rows);
            service.pauseExecution(2000);
        }
    }
}
