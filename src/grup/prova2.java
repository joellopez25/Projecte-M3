package grup;

import java.util.Scanner;

public class prova2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palabra=in.next();
        String palabrainvertida = "";
        while (!palabra.equals("ff")){
            for(int i=palabra.length()-1; 1>0; i--){
            palabrainvertida = palabrainvertida + palabra.charAt(i);
            }

        }
        System.out.print(palabrainvertida);
        palabrainvertida ="";
        palabra=in.next();
        }


    }

