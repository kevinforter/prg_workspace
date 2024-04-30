package ch.hslu.informatik.prg.ledProjekt;

import ch.hslu.prg.ledboard.proxy.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.random.*;

public class ClientApp {

    // Variablen
    private static final int MAX_ROWS = BoardService.MAX_ROWS;
    private static int rows;
    private static Led[][] ledArr;
    private static boolean validInput = false;

    public static void main(String[] args) {

        // Instanzen
        final BoardService service = new BoardService();
        final Scanner sc = new Scanner(System.in);

        System.out.print("Programm Nummer: ");
        int selection = sc.nextInt();

        switch (selection) {
            // Aufruf Methoden
            case 1 -> ledsOnOff(service, sc);
            case 2 -> switchEvenOdd(service, sc);
            case 3 -> showBinary(service, sc);
            case 4 -> showSquare(service, sc);
            case 9 -> createRunningLight(service);
        }
    }

    private static void ledsOnOff(BoardService service, Scanner sc) {

        // 1. Eingabe
        validInput = false;
        do {
            System.out.print("Anzahl hinzuzufügenden LED Reihen [1 - " + MAX_ROWS + "]: ");
            rows = sc.nextInt();

            validInput = rows <= MAX_ROWS && rows >= 1;

        } while (!validInput);

        // 1.2 Eingabe Farbe
        System.out.print("Geben sie die Farbe der LEDs an\n (1) ROT\n (2) GRUEN\n (3) GELB\n (4) BLAU\n (5) FARBIG\nAuswahl: ");
        int colorSelect = sc.nextInt();

        LedColor color = switch (colorSelect) {
            case 2 -> LedColor.GREEN;
            case 3 -> LedColor.YELLOW;
            case 4 -> LedColor.BLUE;
            case 5 -> LedColor.RANDOM;
            default -> LedColor.RED;
        };

        // 2. LED hinzufügen
        ledArr = service.add(rows, color);

        // 3. Pause
        service.pauseExecution(2000);

        // 8. Wiederholung 4-7 (3x)
        for (int i = 0; i <= 3; i++) {

            // 4. Einschalten (Rechts unten → links oben)
            for (int row = ledArr.length - 1; row >= 0; row--) {
                for (int col = ledArr[row].length - 1; col >= 0; col--) {
                    (ledArr[row][col]).turnOn();
                    service.pauseExecution(50);
                }
            }

            // 5. Pause
            service.pauseExecution(250);

            // 6. Ausschalten
            for (Led[] row : ledArr) {
                for (Led led : row) {
                    led.turnOff();
                    service.pauseExecution(50);
                }
            }

            // 7. Pause
            service.pauseExecution(250);
        }

        // 9. Pause
        service.pauseExecution(2000);

        // 10. Zurücksetzen
        service.removeAllLeds();
    }

    private static void switchEvenOdd(BoardService service, Scanner sc) {

        // 1. Eingabe
        validInput = false;
        do {
            System.out.print("Anzahl hinzuzufügenden LED Reihen [1 - " + MAX_ROWS + "]: ");
            rows = sc.nextInt();

            validInput = rows <= MAX_ROWS && rows >= 1;

        } while (!validInput);

        // 2. LED hinzufügen und Pause
        ledArr = service.add(rows);
        service.pauseExecution(2000);

        // 7. Wiederholung 3-6 (3x)
        for (int i = 0; i <= 3; i++) {

            // 3. Gerade Lampen einschalten
            for (Led[] row : ledArr) {
                for (Led led : row) {
                    if (led.getLedId() % 2 == 0) {
                        led.turnOn();
                    } else {
                        led.turnOff();
                    }
                    service.pauseExecution(50);
                }
            }

            // 4. Pause
            service.pauseExecution(1000);

            // 5. Ein Aus Switch
            for (Led[] row : ledArr) {
                for (Led led : row) {
                    if (led.isOn()) {
                        led.turnOff();
                    } else {
                        led.turnOn();
                    }
                    service.pauseExecution(50);
                }
            }

            // 6. Pause
            service.pauseExecution(1000);
        }

        // 8. Alle ausschalten
        for (Led[] row : ledArr) {
            for (Led led : row) {
                if (led.isOn()) led.turnOff();
                service.pauseExecution(50);
            }
        }

        // 9. Pause
        service.pauseExecution(2000);

        // 10. Zurücksetzen
        service.removeAllLeds();
    }

    private static void showBinary(BoardService service, Scanner sc) {

        // 1. Eingabe
        System.out.println("Geben Sie eine Zahl von 0 - 4'294'967'295: ");
        long input = sc.nextLong();

        // 2. Umwandlung Long to String
        StringBuilder binaryString = new StringBuilder(Long.toBinaryString(input));

        // Füge führende 0 hinzu
        while (binaryString.length() < 32) {
            binaryString.insert(0, "0");
        }

        // 3. Eine Reihe hinzufügen
        ledArr = service.add(1);

        // 4. LEDs einschalten
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                ledArr[0][i].turnOn();
            }
        }
    }

    private static void showSquare(BoardService service, Scanner sc) {

        int squareLength;
        int rowTopLeft;
        int colTopLeft;

        // 1. Max Reihen hinzufügen
        ledArr = service.add(MAX_ROWS);

        // 2. Abfrage Koordinaten
        validInput = false;
        do {
            System.out.println("Geben sie die Koordinaten für [topLeft] an");
            System.out.print("Zeile  [0 - " + (ledArr.length - 1) + "]: ");
            rowTopLeft = sc.nextInt();
            System.out.print("Spalte [0 - " + (ledArr.length - 1) + "]: ");
            colTopLeft = sc.nextInt();

            validInput = rowTopLeft >= 0 && rowTopLeft <= ledArr.length - 1 && colTopLeft >= 0 && colTopLeft <= ledArr.length - 1;

        } while (!validInput);

        // 3. Abfragen Länge
        validInput = false;
        do {
            System.out.println("Geben sie die länge des Quadrates an: ");
            System.out.print("Länge [0 - " + ledArr.length + "]: ");
            squareLength = sc.nextInt();

            validInput = squareLength >= 0 && squareLength + rowTopLeft <= ledArr.length && squareLength + colTopLeft <= ledArr.length;

        } while (!validInput);

        // Aufruf 6.2
        System.out.println("Wollen Sie mit oder ohne Diagonalen?\n [1] - YES\n [2] - NO\nAuswahl: ");
        int digSelect = sc.nextInt();

        // 4. Quadrat zeichnen
        for (int i = 0; i < squareLength; i++) {
            (ledArr[rowTopLeft][colTopLeft + i]).turnOn();
            (ledArr[rowTopLeft + i][colTopLeft]).turnOn();
            (ledArr[rowTopLeft + squareLength - 1][colTopLeft + i]).turnOn();
            (ledArr[rowTopLeft + i][colTopLeft + squareLength - 1]).turnOn();
        }

        if (digSelect == 1) showSquare(squareLength, rowTopLeft, colTopLeft);
    }

    // 6.2 Diagonale zeichnen
    private static void showSquare(int squareLength, int rowTopLeft, int colTopLeft) {
        for (int i = 0; i < squareLength; i++) {
            (ledArr[rowTopLeft + i][colTopLeft + i]).turnOn();
            (ledArr[(rowTopLeft + squareLength - 1) - i][colTopLeft + i]).turnOn();
        }
    }

    private static void createRunningLight(BoardService service) {

        // 1. Eine Reihe hinzufügen
        ledArr = service.add(1);

        // 2. Farbe ersetzen
        for (int col = ledArr[0].length - 1; col >= 0; col--) {

            if (col <= 31 && col > 23) {
                ledArr[0][col] = service.replace(ledArr[0][col], LedColor.GREEN);
            } else if (col <= 15 && col > 7) {
                ledArr[0][col] = service.replace(ledArr[0][col], LedColor.BLUE);
            } else if (col <= 7) {
                ledArr[0][col] = service.replace(ledArr[0][col], LedColor.YELLOW);
            }
        }

        // 3. Einschalten der LED
        for (int col = ledArr[0].length - 1; col >= 0; col--) {
            ledArr[0][col].turnOn();
        }

        // 4. Leds verschieben
        for (int i = 0; i < 96; i++) {
            LedColor lastColor = ledArr[0][ledArr[0].length - 1].getColor();

            for (int col = ledArr[0].length - 1; col > 0; col--) {
                ledArr[0][col] = service.replace(ledArr[0][col], ledArr[0][col - 1].getColor());
            }

            // Letzte LED → erste LED
            ledArr[0][0] = service.replace(ledArr[0][0], lastColor);
        }
    }
}