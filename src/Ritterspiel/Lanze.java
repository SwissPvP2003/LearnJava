package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Lanze extends Waffen {
    private int anzahlheande;
    private int laenge;
    private float gewicht;

    public Lanze(int dmg, int lvl, Material material, String name, int anzahlhaende, int laenge, float gewicht) {
        super(dmg, lvl, material, name);
        this.anzahlheande = anzahlhaende;
        this.laenge = laenge;
        this.gewicht = gewicht;
    }

    public int getAnzahlheande() {
        return anzahlheande;
    }

    public void setAnzahlheande(int anzahlheande) {
        this.anzahlheande = anzahlheande;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }
}
