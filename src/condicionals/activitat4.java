package condicionals;

import java.util.Scanner;

public class activitat4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean full,empty;
        System.out.println("is full?");
        full = input.nextBoolean();
        System.out.println("is empty");
        empty = input.nextBoolean();
        if ((full=true) && (empty=false))
        {

            System.out.println("it is full");
        }
        else if ((full=false)&&(empty=true))
        {
            System.out.println("it is empty");
        }

    }
}

