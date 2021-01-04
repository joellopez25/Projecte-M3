import java.util.Scanner;
public class kilometratje {

    public static void main(String[] args) {
        int deposit, litres, kms;
        Scanner input = new Scanner(System.in);
        System.out.println("quina capacitat te el deposit?");
        deposit = input.nextInt();
        System.out.println("cuant litres consum per cada 100 km?");
        litres = input.nextInt();
        kms = (int) (deposit / litres);
        System.out.println("El cotche fara" + kms);
    }
}
