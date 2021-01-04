package projete;

import java.util.Scanner;

public class projecte {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("que vols malalts o buit?");
        String paraula = in.next();


        if (paraula.equals("buit") ){

            int altura = in.nextInt();
            int llargada = in.nextInt();

        for (int x=1;x<=altura;x++) {
            for (int i = 1; i <= llargada; i++) {
                System.out.print("0");
            }
            System.out.println(" ");
        }
        }

        int malaltsalt = (int) (Math.random() * 900 + 1);
        int malaltsllar = (int) (Math.random() * 500 + 1);

        if (paraula.equals("malalts") ) {
            for (int x = 1; x <= malaltsalt; x++) {
                for (int i = 1; i <= malaltsllar; i++) {
                    System.out.print("0");

                }
                System.out.println(" ");
            }
        }
    }
}
