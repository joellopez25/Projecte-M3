package condicionals;

import java.util.Scanner;

public class avançat4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float percentatje,ph;
        System.out.println("quin persentatje tenim?");
        percentatje = input.nextFloat();
        System.out.println("quin ph tenim?");
        ph = input.nextFloat();
        if ((percentatje>66)&&(ph>3)) {
            System.out.println("te molta contaminacio i ph");
        }
        else if ((percentatje<=66)&&(ph<3)){
            System.out.println("no te contaminacio ni ph");
        }
        else if((percentatje>66)&&(ph<=3)){
            System.out.println("te molta contaminacio pero no te ph");
        }
        else if ((percentatje<66)&&(ph>3)){
            System.out.println("no te contaminacio pero si te molt ph");
        }
    }
}
