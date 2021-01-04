package array;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String palabras = "Alfa, Beta, Delta, Gamma, Sigma";
        String[] arrSplit = palabras.split(",");

        for (int i = 0; i<palabras.length();i++)
            System.out.println(arrSplit[i]);
        
    }
}
