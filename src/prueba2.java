import java.util.Scanner;

public class prueba2 {
    public static void main (String [] args)  {
        Scanner s = new Scanner (System.in);
        int i = s.nextInt();
        int unit = i%10;
        int des = (i%100)/10;
        int cent = i/100;
        int sum = unit+ des + cent;
        System.out.println("    El meu sumatori de   " + i + "   Es   " + sum);
    }
}
