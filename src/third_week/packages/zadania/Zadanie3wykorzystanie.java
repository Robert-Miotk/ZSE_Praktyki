package third_week.packages.zadania;

import third_week.packages.zadania.zadanie3.zadanie3;

import java.util.Scanner;

class Zadanie3wykorzystanie extends zadanie3 {
    public static void main(String[] args) {
        Zadanie3wykorzystanie list = new Zadanie3wykorzystanie();

        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int x = skaner.nextInt();
        System.out.print("Podaj liczbę: ");
        int y = skaner.nextInt();

        System.out.print(list.mnozenie(x,y));
    }
}
