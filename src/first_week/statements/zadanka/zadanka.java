package first_week.statements.zadanka;

import java.util.Scanner;

public class zadanka {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        // zadanie 1
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = skaner.nextInt();
        if(liczba>0){
            System.out.print("Liczba jest większa od zera.");
        }
        else{
            if(liczba<0){
                System.out.print("Liczba jest mniejsza od zera.");
            }
            else{
                System.out.print("Liczba jest równa zero.");
            }
        }
        // zadanie 2
        System.out.print("\nPodaj pierwszą liczbę: ");
        int pierwsza = skaner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int druga = skaner.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int trzecia = skaner.nextInt();

        if(pierwsza>druga&&pierwsza>trzecia){
            System.out.print("Pierwsza liczba jest największa.");
        }
        else if(druga>pierwsza&&druga>trzecia) {
            System.out.print("Druga liczba jest największa.");
        }
            else if(pierwsza==druga||druga==trzecia){
                System.out.print("Istnieją dwie lub trzy takie same liczby.");
            }
            else{
            System.out.print("Trzecia liczba jest największa.");
        }
        // zadanie 3
        System.out.print("\nPodaj login: ");
        String login = skaner.next();
        System.out.print("Podaj hasło: ");
        String haslo = skaner.next();
        if(login.equals("Masny")&&haslo.equals("Grzib123")){
            System.out.print("Zalogowano!");
        }
        else{
            System.out.print("Niepoprawne dane.");
        }
        // zadanie 4
        System.out.print("\nPodaj pierwszą liczbę: ");
        int a = skaner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = skaner.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int c = skaner.nextInt();

        if(a>b&&a>c){
            System.out.print("Kolejność malejąca.");
        }
        else if(b>a&&b>c) {
            System.out.print("Kolejność niepoprawna.");
        }
        else if(a==b||b==c){
            System.out.print("Istnieją dwie lub trzy takie same liczby - kolejność niepoprawna.");
        }
        else{
            System.out.print("Kolejność rosnąca.");
        }
        // zadanie 5
        System.out.print("\nPodaj pierwszą liczbę: ");
        float x = skaner.nextFloat();
        System.out.print("Podaj drugą liczbę: ");
        float y = skaner.nextFloat();
        System.out.print("Podaj swój wybór (+,-,*,/): ");
        char z = skaner.next().charAt(0);
        switch(z){
            case '+':
                float suma = x+y;
                System.out.print("Wynik dodawania: "+suma);
                break;
            case '-':
                float roznica = x-y;
                System.out.print("Wynik odejmowania: "+roznica);
                break;
            case '*':
                float mnozenie = x*y;
                System.out.print("Wynik mnożenia: "+mnozenie);
                break;
            case '/':
                float dzielenie = x/y;
                System.out.print("Wynik dzielenia: "+dzielenie);
                break;
        }

    }
}
