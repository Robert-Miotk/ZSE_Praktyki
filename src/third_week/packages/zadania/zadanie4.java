package third_week.packages.zadania;

import java.util.Scanner;

class info{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

public class zadanie4 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj wiek: ");
        int a = skaner.nextInt();
        System.out.print("Podaj imię: ");
        String n = skaner.next();

        info i = new info();
        i.setAge(a);
        i.setName(n);

        System.out.println("Imię: " + i.getName() + " Wiek: " + i.getAge());
    }
}