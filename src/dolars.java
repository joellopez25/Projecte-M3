import java.util.Scanner;

public class dolars {

    public static void main(String[] args) {
        float Import, Resultat;
        Scanner input = new Scanner(System.in);
        System.out.println("quanta cuantitat de euros tens?.");
        Import = input.nextFloat();
        Resultat = (float) (Import * 1.18);
        System.out.println("El resultat del import convertit a euros es: "+ Resultat);
    }

}
