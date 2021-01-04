import java.util.Scanner;

public class prueba3 {
    public static void main (String [] args) {


        Scanner s = new Scanner(System.in) ;
        float num = s.nextFloat();
        long numEnter = (long)num;
        double numDecimal = num - numEnter;
        System.out.println("El numero" + num + "te els seguents decimals" + numDecimal);

    }
}
