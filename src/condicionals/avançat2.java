package condicionals;

import java.util.Scanner;

public class avançat2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int colesterol;
        System.out.println("quantos habitantes ahi?");
        colesterol = input.nextInt();

        if (colesterol<200){
            System.out.println(+ colesterol + "  risc baix");
        }
        if ((colesterol>=200) && (colesterol<=300)){
            System.out.println(+ colesterol + " risc intermig");
        }
        if (colesterol>300){
            System.out.println(+ colesterol + "  Risc alt");
        }
    }
}
