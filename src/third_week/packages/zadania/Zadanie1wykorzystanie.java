package third_week.packages.zadania;

import third_week.packages.zadania.zadanie1.zadanie1;

import java.util.Scanner;

public class Zadanie1wykorzystanie {
    public static void main(String[] args) {
        new zadanie1();

        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String x = skaner.next();
        System.out.print("Podaj nazwisko: ");
        String y = skaner.next();

        System.out.println(zadanie1.imie(x,y));
    }
}