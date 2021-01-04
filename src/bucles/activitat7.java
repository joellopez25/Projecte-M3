package bucles;

import java.util.Scanner;

public class activitat7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String chain = in.nextLine();
        for(int i = 0;i <chain.length(); i++)
        if(i %2==0) {

            System.out.print(chain.charAt(i));
        }
        }

    }

