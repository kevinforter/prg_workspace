package ch.hslu.informatik.prg.block06.afg02;

public class Leiter extends Sachbearbeiter{

    private static final double bonus = 0.15;
    @Override
    public double berechneLohn() {
        // Lohn = Lohn * ProzentInAnzahlJahren
        // + 15% Lohn als Bonus
        double lohn = grundLohn + (grundLohn * ((currentYear - getJahrEinstellung()) / 100));
        lohn += lohn * bonus;
        return lohn;
    }
}
