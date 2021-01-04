import java.util.Scanner;

public class hdd {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int gb = in.nextInt();
        float gbReals = (float)(gb*Math.pow(1000,3) / Math.pow(1024,3));
       System.out.println();
    }
}
