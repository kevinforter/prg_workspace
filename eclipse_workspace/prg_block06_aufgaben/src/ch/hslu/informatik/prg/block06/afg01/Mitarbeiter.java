package ch.hslu.informatik.prg.block06.afg01;

import java.util.Calendar;

public abstract class Mitarbeiter {

    private double jahrEinstellung;
    private String name;
    private String position;
    public double grundLohn = 6000;
    public double currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public abstract double berechneLohn();

    public Mitarbeiter() {

    }
    public Mitarbeiter(int jahrEinstellung, String name, String Position) {
        this.jahrEinstellung = jahrEinstellung;
    }

    public double getJahrEinstellung() {
        return jahrEinstellung;
    }
    public void setJahrEinstellung(int jahrEinstellung) {
        this.jahrEinstellung = jahrEinstellung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {return position + ": " + name + "\n" +
            "Anstellungsjahr: " + (int)getJahrEinstellung()+ "\n" +
            "Lohn:" + "\t\t" + " " + berechneLohn() + "\n";}
    /*"Ausbildungsjahr: " + (int)(currentYear - getJahrEinstellung()) -> für Lehrling*/
}
