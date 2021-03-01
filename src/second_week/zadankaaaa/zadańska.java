package second_week.zadankaaaa;

public class zadańska {
    public static void main(String[] args) {
        //zadanie 1
        System.out.println("\nZADANIE 1\n");
        int i;
        for(i=0;i<21;i=i+2){
            System.out.println("I to = "+i);
        }
        //zadanie 2
        System.out.println("\nZADANIE 2\n");
        for(i=30;i>=0;i=i-3){
            System.out.println("I to = "+i);
        }
        //zadanie 3
        System.out.println("\nZADANIE 3");
        for(i=1;i<11;i++){
            System.out.println("\n"+i+" <----\n");
            for(int j=1;j<11;j++){
                if(i*j%2==0){
                System.out.println(i+"*"+j+" = "+i*j+"\t");
                }
                else{
                System.out.println(i+"*"+j+" = "+"x"+"\t");
                }
            }
        }
        //zadanie 4
        System.out.println("\nZADANIE 4\n");
        for(i=-40;i<=40;i++){
            if(i%4==0){
                System.out.println("I to = "+i);
                }
        }
    }
}

