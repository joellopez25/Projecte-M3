import java.util.Scanner;

public class cadenes3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        String correo = ("@sapalomera.cat");
        System.out.print("Ingrese el nombre:");
        nombre=input.next();
        System.out.print(nombre + correo);
    }
}

