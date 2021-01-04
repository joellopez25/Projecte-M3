package avanzados;

import java.util.Scanner;

public class activitat1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String sTexto = reader.next();
        do {
            sTexto = reader.next();
            System.out.printf(sTexto);

        }
        while(!sTexto.equals("FIN"));


    }

}
