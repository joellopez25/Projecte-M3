import java.util.Scanner;

public class prueba4 {
    public static void main (String [] args) {


        Scanner s = new Scanner(System.in) ;
        float num = s.nextFloat();
        long numEnter = (long)num;
        double digDecimal = (float) (int)((num - numEnter)*10);
        System.out.println("  El numero   " + num + "   te el 1r decimal   " + digDecimal);

    }
}
