package ch.hslu.informatik.prg.block06.afg01;
import java.text.DecimalFormat;
public class LohnberechnungTest {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#0.0");

        Lehrling lehrling = new Lehrling();
        lehrling.setName("Marco Weber");
        lehrling.setJahrEinstellung(2023);
        lehrling.setPosition("Lernender");
        System.out.println(lehrling);

        Sachbearbeiter sachbearbeiter = new Sachbearbeiter();
        sachbearbeiter.setName("Urs Kaufmann");
        sachbearbeiter.setJahrEinstellung(2023);
        sachbearbeiter.setPosition("Sachbearbeiter");
        System.out.println(sachbearbeiter);

        Leiter leiter = new Leiter();
        leiter.setName("Thomas Lindauer");
        leiter.setJahrEinstellung(2023);
        leiter.setPosition("Leiter");
        System.out.println(leiter);

        lehrling.setJahrEinstellung(2021);
        System.out.println(lehrling);

        sachbearbeiter.setJahrEinstellung(2016);
        System.out.println(sachbearbeiter);

        leiter.setJahrEinstellung(2016);
        System.out.println(leiter);

    /*String[][] mitarbeiter = {
            {lehrling.getName(), String.valueOf(lehrling.berechneLohn())},
            {sachbearbeiter.getName(), String.valueOf(sachbearbeiter.berechneLohn())},
            {leiter.getName(), String.valueOf(leiter.berechneLohn())}
    };

    for (String[] i : mitarbeiter) {
        System.out.println("Gehalt " + i[0] + ":\t" + i[1] + " CHF");
    }*/

        Mitarbeiter[] mitarbeiter = {lehrling, sachbearbeiter, leiter};

        for (Mitarbeiter m : mitarbeiter) {
            System.out.println("Gehalt " + m.getName() + ":\t" + df.format(m.berechneLohn()) + " CHF");
        }

    }
}