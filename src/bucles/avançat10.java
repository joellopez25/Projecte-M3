package bucles;

import java.util.Scanner;

public class avançat10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = (int) ((Math.random() * 100)+1);
        int b;
        int i;

        System.out.println("averigua el numero");

        System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 100: ");
        b = s.nextInt();

        for (i=0; i<=4; i++) {

            if (a == b) {
                System.out.println("¡Has acertado!");
                break; }

            else if (i == 5){
                System.out.println("los siento te as quedado sin intentos");
            }
            else if (a<b){
                System.out.println("el numero que as introducido es mas grande que el numero que tienes que averiguar");
            }
            else if (a>b){
                System.out.println("el numero que as introducido es mas pequeño que el numero que tienes que averiguar");
            }
            if (i <=1) {
                System.out.print("Otro intento: ");
                b = s.nextInt(); }
            else if (i ==2) {
                System.out.print("Inténtalo de nuevo: ");
                b = s.nextInt(); }
            else if (i >= 3) {
                System.out.print("ÚLTIMO intento: ");
                b = s.nextInt(); }
        }
    }
}
