import java.util.Scanner;

public class eleccions {
    public static void main(String[] args) {
        double trump, biden, resultado;
        Scanner input = new Scanner(System.in);
        System.out.println("votos de trump?");
        trump = input.nextDouble();
        System.out.println("votos de biden?");
        biden = input.nextDouble();
        if (trump > biden)
        {
            System.out.println(" trump tiene mas votos " + trump);
        }
        else
        {
            System.out.println(" biden tiene mas votos" + biden);
        }
    }
}
