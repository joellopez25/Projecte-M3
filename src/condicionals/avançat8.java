package condicionals;

import java.util.Scanner;

public class avançat8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double quota,litros;
        quota = 6;
        System.out.println("cuants litres vols?");
        litros= input.nextDouble();

        if ((litros>1)&&(litros<50)){
            System.out.println("els litres son gratis pero pagas la cuota   "+quota + "   euros");
        }
        else if ((litros>=50)&&(litros<200)){
            litros = litros * 0.1 + quota;
            System.out.println("me e gastado"+ litros + "   euros");
        }
        else if ((litros>=200)&&(litros<400)) {
            litros = litros * 0.3 + quota;
            System.out.println("me e gastado" + litros + "   euros");
        }
        else if (litros>=400){
            litros = litros * 0.6 + quota;
            System.out.println("me e gastado   " + litros + "   euros");
        }
    }
}
