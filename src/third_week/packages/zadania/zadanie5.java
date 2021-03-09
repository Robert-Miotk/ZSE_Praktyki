package third_week.packages.zadania;

public class zadanie5 {
    public static class Warsztat {
        public void wszedles(){
            System.out.println("Wszedłeś do warsztatu");
        }
    }
    public static class Szafka extends Warsztat{
        public void otworzyles(){
            System.out.println("Otworzyłeś szafkę na narzędzia");
        }
    }
    public static class Narzedzia extends Szafka{
        public void wziales(){
            System.out.println("Wziąłeś klucz");
        }
    }

    public static void main(String[] args) {
        Narzedzia narzedzia = new Narzedzia();
        narzedzia.wszedles();
        narzedzia.otworzyles();
        narzedzia.wziales();
    }

}