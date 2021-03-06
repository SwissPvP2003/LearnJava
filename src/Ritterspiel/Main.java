package Ritterspiel;

public class Main {

    public static void main(String[] args) {

        //Materialien

        Material holz = new Material("Holz", 1, "braun");

        Material eisen = new Material("Eisen", 4, "grau");

        Material diamant = new Material("Diamant", 3, "balu");

        Material gold = new Material("Gold", 5, "gelb");

        Material adamant = new Material("Adamant", 2, "grau");

        Material obsidian = new Material("Obsidian", 10, "schwarz");

        Material leder = new Material("Leder", 2, "braun");

        //Waffen & Rüstungen

        Dolch dolch = new Dolch(100, 1, holz, "Dolch", 20, 1);

        Schwert langschwert = new Schwert(200, 4, obsidian, "Langschwert", 2, 2, 10);

        Schwert schwert = new Schwert(100, 1, eisen, "Schwert", 1, 2, 5);

        Ruestung eisenHelm = new Ruestung(20, 2, "EisenHelm", eisen);

        Ruestung goldenerBrustpanzer = new Ruestung(100, 4, "GoldenerBrustpanzer", gold);

        Ruestung lederweste = new Ruestung(50, 5, "Heilige weste des Johanes", leder);

        Fernkampfwaffe obsidianBogen = new Fernkampfwaffe(100, 10, obsidian, "ObsidianBogen", 60, 15);

        //Ritter

        SchwertRitter heinrich = new SchwertRitter(120, 20, 2, "Heinrich", goldenerBrustpanzer, langschwert);

        SchwertRitter schwarzerRitter = new SchwertRitter(120, 25, 3, "Schwarzer_Ritter", goldenerBrustpanzer, langschwert);

        SchwertRitter ernst = new SchwertRitter(100, 10, 3, "Ernst", eisenHelm, schwert);

        SchwertRitter max = new SchwertRitter(150, 19, 2, "Max", goldenerBrustpanzer, langschwert);

        Lanzentraeger jan = new Lanzentraeger(50, 10, 1, "Jan");

        Bogenschuetze hans = new Bogenschuetze(150, 20, 2, "Hans", lederweste, obsidianBogen);


        //Ausrüsten
        heinrich.setRuestung(eisenHelm);
        jan.setWaffen(dolch);
        max.setWaffen(langschwert);

        //Logik
        jan.hit(heinrich);
        jan.printhit(heinrich);
        max.hit(jan);
        schwarzerRitter.print();
        heinrich.print();
        ernst.print();
        ernst.printhit(schwarzerRitter);
        max.print();
        jan.print();
        System.out.println(obsidianBogen.getGewicht());
    }
}
