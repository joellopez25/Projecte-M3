package bucles;
import java.util.Scanner;

public class ejemplo1 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero;

        do {
            System.out.println("digam un numero?");
            numero = s.nextInt();

            if (numero %2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }
        } while (numero < 1000);

    }
}













