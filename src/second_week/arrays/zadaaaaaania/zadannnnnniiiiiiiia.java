package second_week.arrays.zadaaaaaania;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class zadannnnnniiiiiiiia {
    public static void main(String[] args) {
        //z1
        System.out.println("\nZADANIE 1");
        char[] charArray={'z','w','j','e','g','s','p','q','m','a'};
        Arrays.sort(charArray);
        System.out.println("Sortowanie w porządku rosnącym: "+Arrays.toString(charArray));
        //z2
        System.out.println("\nZADANIE 2");
        String[] stringArray={"~","Grziby","są","dobre","fest",",","o","ma","ma","le"};
        Arrays.sort(stringArray,Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: "+Arrays.toString(stringArray));
        //z3
        System.out.println("\nZADANIE 3");
        Random rand=new Random();
        String[] imiona={"Jaca","Goha","Zdzisław"};
        int imie=rand.nextInt(imiona.length);
        System.out.println("Pimpek wabi się: "+imiona[imie]);
        //z4
        System.out.println("\nZADANIE 4");
        String[] sniadanie={"Bułkę z masłem","Płatki z mlekiem","Tosty"};
        String[] obiad={"Zupę pomidorową","Spaghetti","Schaboszczaka z ziemniakami"};
        String[] kolacja={"Sałatkę","Kanapkę","Nic"};
        int s=rand.nextInt(sniadanie.length);
        System.out.println("Na śniadanie zjem: "+sniadanie[s]);
        int o=rand.nextInt(obiad.length);
        System.out.println("Na obiad zjem: "+obiad[o]);
        int k=rand.nextInt(kolacja.length);
        System.out.println("Na kolację zjem: "+kolacja[k]);
        //z5
        System.out.println("\nZADANIE 5");
        Integer[] zmienna={6,1,5,2,8,10,4,3,7,9,11,15,20,12,13,17,14,16,18,19};
        Arrays.sort(zmienna,0,10,Collections.reverseOrder());
        Arrays.sort(zmienna,10,20);
        System.out.println("Sortowanie: "+Arrays.toString(zmienna));
    }
}
