package condicionals;

import java.util.Scanner;

public class avançat5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.println("digam un numero");
        numero= input.nextInt();

        if (numero == 10){
            System.out.println("El numero 10 sera la LLetra A");
        }
        else if (numero == 11){
            System.out.println("El numero 10 sera la LLetra B");
        }
        else if (numero == 12){
            System.out.println("El numero 10 sera la LLetra C");
        }
        else if (numero == 13){
            System.out.println("El numero 10 sera la LLetra d");

        }
        else if (numero == 14){
            System.out.println("El numero 10 sera la LLetra E");
        }
        else if (numero == 15){
            System.out.println("El numero 10 sera la LLetra F");
        }
    }
}
