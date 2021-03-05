package second_week.metodyundsuszarken.zadanejro;

interface piecpiekacz {
    void pieczenieciastek();
    void pieczeniechlyba();
}

interface piecgrill {
    void grilowaniekurczoka();
}


public class zadania_ni implements piecpiekacz, piecgrill {

    private int czas;
    private int temperatura;
    private String corobi;
    private String nazwa;

    @Override
    public void pieczenieciastek() {
        czas = 60;
        temperatura = 220;
        corobi = "piecze ciastka";
        nazwa = "piekacz";
        wlacz();
    }

    @Override
    public void pieczeniechlyba() {
        czas = 120;
        temperatura = 260;
        corobi = "piecze chlyb";
        nazwa = "piekacz";
        wlacz();
    }

    @Override
    public void grilowaniekurczoka() {
        czas = 90;
        temperatura = 200;
        corobi = "griluje kurczaka";
        nazwa = "grill";
        wlacz();
    }

    private void wlacz() {
        System.out.println("Piec "+nazwa+" "+corobi+". Wlaczamy piec," +
                " ustawiamy temperature na " + temperatura
                + " stopni i czas trwania na "+ czas +" minut");
    }

    public static void main(String[] args) {
        zadania_ni piece = new zadania_ni();

        piecpiekacz piecpiekaczzzzzz = piece;
        piecgrill piecgrilllllll = piece;

        piecpiekaczzzzzz.pieczenieciastek();
        piecpiekaczzzzzz.pieczeniechlyba();
        piecgrilllllll.grilowaniekurczoka();
    }
}