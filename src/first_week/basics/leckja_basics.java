package first_week.basics;

public class leckja_basics {




    // to jest nasza metoda główna
    public static void main(String[] args) {

        // liczby całkowite
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;

        // dodawanie zmiennych

        int sum = myIntA + myIntB + myIntC;
        System.out.println("Dodawanie wynik: " + sum);

        // odejmowanie zmiennych

        sum = myIntA - myIntB - myIntC;
        System.out.println("Odejmowanie wynik: " + sum);

        // mnozenie zmiennych

        sum = myIntA * myIntB * myIntC;
        System.out.println("Mnożenie wynik: " + sum);

        // dzielenie zmiennych

        sum = myIntB / 2;
        System.out.println("Dzielenie B przez 2 wynik: " + sum);

        sum = myIntC / 2;
        System.out.println("Dzielenie C przez 2 wynik: " + sum);

        // float / double
        double myDoubleA = 1.65;
        double myDoubleB = 1.44;

        double sumDouble;
        sumDouble = myDoubleA * myDoubleB;

        System.out.println(sumDouble);

        // znaki (characters)

        char myCharA = 'F';
        char myCharB = 'T';
        char myCharC = '$';

        System.out.println("Moja ulubiona literka to: " + myCharA);
        System.out.println("Moj ulubiony znak to: " + myCharC);

        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("Suma znakow to: " + sumChar);

        // string ciagi znakow slowa i wyrazy

        String myStringA = "Marcin";
        String myStringB = "lubi placki";
        String myStringC = " z dzemem.";

        System.out.println(myStringA + "\t\t\t\t" + myStringB + myStringC);

        // boolean
        boolean myBoolean = true;

        System.out.println(!myBoolean);

    }
}
