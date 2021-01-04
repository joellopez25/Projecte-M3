package grup;

import java.util.Scanner;

public class prova {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        int contador = in.nextInt();
        float mitjana = 0;
        int max = 0;
        int min = 10;
        int aproben=0;

        for(int i = 0;i < contador;i++) {
            int num=in.nextInt();
            max = Math.max(num,max);
            min = Math.min(num,min);
            mitjana+=num;
            if (num >= 5 ){
                aproben++;
            }
        }


        mitjana=mitjana/contador;
        System.out.printf("El maximo es %d, el Minimo es %d i la mitjana es %.2f",max,min,mitjana);
    }
}
