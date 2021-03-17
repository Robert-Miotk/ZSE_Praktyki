package projekt;

import java.util.Scanner;

public class wisielec {

    private static String[] slowafest = {"jaca", "kąkuter", "kobra", "tiger", "kopytko", "azerbejdżan" };
    private static String slowo = slowafest[(int) (Math.random() * slowafest.length)];
    private static String gwiazdkowanie_slowa = new String(new char[slowo.length()]).replace("\0", "*");
    private static int proby = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (proby < 7 && gwiazdkowanie_slowa.contains("*")) {
            System.out.println("Zgadnij literkę:");
            System.out.println(gwiazdkowanie_slowa);
            String zgadnij = sc.next();
            wisifest(zgadnij);
        }
        sc.close();
    }

    public static void wisifest(String zgadnij) {
        String gwiazda = "";
        for (int i = 0; i < slowo.length(); i++) {
            if (slowo.charAt(i) == zgadnij.charAt(0)) {
                gwiazda += zgadnij.charAt(0);
            } else if (gwiazdkowanie_slowa.charAt(i) != '*') {
                gwiazda += slowo.charAt(i);
            } else {
                gwiazda += "*";
            }
        }

        if (gwiazdkowanie_slowa.equals(gwiazda)) {
            proby++;
            wisielecImage();
        } else {
            gwiazdkowanie_slowa = gwiazda;
        }
        if (gwiazdkowanie_slowa.equals(slowo)) {
            System.out.println("Zgadłeś, poprawne słowo to '"+slowo+"'");
        }
    }

    public static void wisielecImage() {
        if (proby == 1) {
            System.out.println("Niet, spróbuj jeszcze roz ino");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (proby == 2) {
            System.out.println("Niet, spróbuj jeszcze roz ino");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (proby == 3) {
            System.out.println("Niet, spróbuj jeszcze roz ino");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (proby == 4) {
            System.out.println("Niet, spróbuj jeszcze roz ino");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (proby == 5) {
            System.out.println("Niet, spróbuj jeszcze roz ino");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (proby == 6) {
            System.out.println("Niet, spróbuj jeszcze roz ino");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (proby == 7) {
            System.out.println("Przegrałeś, koniec giery do spania");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("Masne słowo to '"+slowo+"'");
        }
    }
}
