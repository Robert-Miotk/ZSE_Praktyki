package third_week.packages.zadania;

import third_week.packages.zadania.zadanie2.zadanie2;

import java.util.Scanner;

class Zadanie2wykorzystanie {
    public static void main(String[] args) {
        zadanie2 list = new zadanie2();

        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj miejscowość: ");
        String x = skaner.next();
        System.out.print("Podaj ulicę: ");
        String y = skaner.next();

        System.out.println(list.jakiesdane(x,y));
    }
}