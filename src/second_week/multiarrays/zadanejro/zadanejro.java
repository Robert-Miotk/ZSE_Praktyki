package second_week.multiarrays.zadanejro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class zadanejro {
    public static void main(String[] args) {
        //z1-tablice
        System.out.println("\nZADANIE 1 - TABLICE");
        int[][] array = new int[5][5];
        int value = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                array[i][j] = value;
                value = value + 5;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        //z2-tablice
        System.out.println("\nZADANIE 2 - TABLICE");
        int[][][][] array2 = new int[3][3][3][3];
        int value2 = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                for (int n = 0; n < 3; n++){
                    for (int m = 0; m < 3; m++){
                        array2[i][j][n][m] = value2;
                        value2=value2+1;
                        System.out.print(array2[i][j][n][m] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        //z1-lista
        //1.
        System.out.println("ZADANIE 1 - LISTA");
        ArrayList<String> gry = new ArrayList<>();
        gry.add("gta");
        gry.add("minecraft");
        gry.add("cs goł");
        System.out.println("Lista po stworzeniu:\n"+gry);
        gry.add("r6");
        System.out.println("\nLista po dodaniu zwykłym:\n"+gry);
        gry.add(3, "fifa");
        System.out.println("\nLista po dodaniu index'owym:\n"+gry);
        //2.
        gry.remove("cs goł");
        System.out.println("\nLista po usunięciu:\n"+gry);
        gry.remove(0);
        System.out.println("\nLista po usunięciu index'owym:\n"+gry);
        //3.
        gry.set(0, "dota2");
        System.out.println("\nLista po zamianie:\n"+gry);
        //4.
        Collections.sort(gry);
        System.out.println("\nLista po sortowaniu:\n"+gry);
        //5.
        gry.clear();
        System.out.println("\nLista po wyczyszczeniu:\n"+gry);
        //z3-tablice
        System.out.println("\nZADANIE 3 - TABLICE");
        int[][][][][] array3 = new int[2][2][2][2][2];
        int value3 = 0;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                for (int n = 0; n < 2; n++){
                    for (int m = 0; m < 2; m++){
                        for (int z = 0; z < 2; z++){
                            array3[i][j][n][m][z] = value3;
                            value3=value3+1;
                            System.out.print(array3[i][j][n][m][z] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        //z4-tablice
        System.out.println("ZADANIE 4 - TABLICE");
        Random rand=new Random();
        int[][] array4 = new int[2][2];
        int[][] array5 = new int[2][2];
        int[][] array6 = new int[2][2];
        System.out.println("PIERWSZA TABLICA:");
        for(int i = 0; i < array4.length; i++){
            for (int j = 0; j < array4.length; j++){
                array4[i][j]=rand.nextInt(10);
                System.out.println(array4[i][j]);
            }
        }
        System.out.println("DRUGA TABLICA:");
        for(int i = 0; i < array5.length; i++){
            for (int j = 0; j < array5.length; j++){
                array5[i][j]=rand.nextInt(10);
                System.out.println(array5[i][j]);
            }
        }
        System.out.println("TRZECIA TABLICA:");
        for(int i = 0; i < array6.length; i++){
            for (int j = 0; j < array6.length; j++){
                array6[i][j]= array4[i][j]+array5[i][j];
                System.out.println(array6[i][j]);
            }
        }
    }
}
