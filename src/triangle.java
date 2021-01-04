import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        float ATriangle, base, altura;
        Scanner input = new Scanner(System.in);
        System.out.println("Possa la base del triangle per calcular l'area de ell.");
        base = input.nextFloat();
        System.out.println("Possa la altura del triangle per terminar de calcular l'area.");
        altura = input.nextFloat();
        ATriangle = (float) (base*altura)/2;
        System.out.println("El Area del triangle es: "+ATriangle);
    }

}
