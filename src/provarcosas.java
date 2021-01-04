import java.util.Scanner;

public class provarcosas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ciutat="Blanes";
        int ultimaposicio = ciutat.length()-1;
        System.out.println(ciutat.charAt(ultimaposicio)  );
        System.out.println(ciutat.substring(1,3));
        ciutat = ciutat+" (Girona)";
        ciutat = ciutat.replace("i","c");
        System.out.println(ciutat.toUpperCase());



    }
}
