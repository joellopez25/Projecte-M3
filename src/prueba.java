import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        int A, B, Resultado;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        A = input.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        B = input.nextInt();
        Resultado = 10*A/B;
        System.out.println("El resultat es: "+Resultado);
    }

}

