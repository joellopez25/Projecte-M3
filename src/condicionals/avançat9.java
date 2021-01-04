package condicionals;

import java.util.Scanner;

public class avançat9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introdueix un numero?");
        int num = in.nextInt();
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial = " + fact);
    }
}
