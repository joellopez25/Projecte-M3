package condicionals;

import java.util.Scanner;

public class avançats7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tenperatura;
        System.out.print("quina tenperatura vols?");
        tenperatura= input.nextInt();

        if (tenperatura>30) {
            System.out.print("amb tenperatura de 30 podras fer Natacio ");
        }
        else if ((tenperatura>20)&&(tenperatura<=30)){
            System.out.print("amb la teperatura entre 20 i 30 podras fer Padel ");
        }
        else if ((tenperatura>10)&&(tenperatura<=20)){
            System.out.print("amb la tenperatura entre 10 i 20 podras fer running ");
        }
        else if ((tenperatura>5)&&(tenperatura<=10)){
            System.out.print("amb aquesta tenperatura entre 5 i 10 podras fer esqui ");
        }
        else if (tenperatura<=5){
            System.out.print("Amb aquesta tenperatura podras fer parxis ");
        }


    }
}
