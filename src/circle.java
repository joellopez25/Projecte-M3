import java.util.Scanner;

public class circle {
    public static void main(String [] args) {
        double radio, area;
        System.out.println("Si vols saber el area d'un circle, posa el radi del cercle per calcular-ho. ");
        Scanner input = new Scanner(System.in);
        radio = input.nextDouble();
        area =  (Math.PI*radio*radio);
        System.out.println("La Area del circle es: " + area);
    }
}
