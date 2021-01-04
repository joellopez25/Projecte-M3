package cadenas;

import java.util.Scanner;

public class cadenas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("com et dius");
       String palabra= in.nextLine();
        palabra=palabra.replace("","");
        int llargada = palabra.length();
        System.out.printf("la llergada del teu nom es $s",llargada);
    }
}
