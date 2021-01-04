package bucles;

import java.util.Scanner;

public class activitat8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String joel = in.nextLine();

        System.out.println("quina lletra no vols mostra");
        char lletra = in.nextLine().charAt(0);

        for (int i = 0; i < joel.length(); i++) {
            if (joel.charAt(i) != lletra) {
                System.out.println(joel.charAt(i));
            }

        }
    }
}