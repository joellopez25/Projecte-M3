package array;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = 10;
        int[] beta = new int[size];
        beta[0] = 3;
        beta[1] = 5;
        for (int i = 2; i < 7; i++) {
            beta[i] = 3 * i + 2;
            beta[i - 1] = beta[i - 1] + beta[i];
            beta[i - 2] = beta[i - 2] + beta[i - 1];
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(beta[i] + " ");
        }
        System.out.println();
    }
    }
