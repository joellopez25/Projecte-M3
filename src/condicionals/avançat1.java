package condicionals;

import java.util.Scanner;

public class avançat1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float habitants;
        System.out.println("quantos habitantes ahi?");
        habitants = input.nextFloat();

        if (habitants<=10000000) {
            System.out.println("los habitantes   " + habitants + "  son menores");
        }
        else if ((habitants>10000000) && (habitants<35000000)){
            System.out.println("tiene habitantes   " + habitants);
        }
        else if (habitants>10000000){
            System.out.println("los habitantes   " + habitants + "  son mayores");
        }
        }
    }

