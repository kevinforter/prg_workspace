package ch.hslu.informatik.prg.block06.afg01;

public class Sachbearbeiter extends Mitarbeiter {

    @Override
    public double berechneLohn() {
        // Lohn = Lohn * ProzentInAnzahlJahren
        double lohn = grundLohn + (grundLohn * ((currentYear - getJahrEinstellung()) / 100));
        return lohn;
    }
}
