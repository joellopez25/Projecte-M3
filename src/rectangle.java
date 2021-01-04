import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        double height, width, resultado;
        Scanner input = new Scanner(System.in);
        System.out.println("Possa la base del rectangle per calcular.");
        width = input.nextFloat();
        System.out.println("Possa la altura del rectangle per calcular-lo .");
        height = input.nextFloat();
        resultado = (double) (width*height)/2;
        System.out.println("El Area del rectangle es: "+resultado);
    }
}
