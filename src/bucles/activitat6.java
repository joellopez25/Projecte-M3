package bucles;

import java.util.Scanner;

public class activitat6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String pal =in.nextLine();
        for (int i = pal.length()-1; i >= 0; i--){
            System.out.print(pal.charAt(i));
        }
    }
}
