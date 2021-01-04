package array;

import java.util.Scanner;

public class prova {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int[] listaNum = new int[20];
        int suma = 0;
        int nombresIntervenenMitja = 0;
        int pos = 0;
        double mitjana = 0;


        System.out.println("Entra un numero. 0 para terminar.");
        int numeroEntrada = entrada.nextInt();
        while ((numeroEntrada != 0) && (pos < 20)) {
            listaNum[pos] = numeroEntrada;
            System.out.println("Entra un numero. 0 para terminar.");
            numeroEntrada = entrada.nextInt();
            pos++;
        }

        for (int i = 0; i < listaNum.length; i++) {
            if (listaNum[i] != 0) {
                suma = suma + listaNum[i];
                nombresIntervenenMitja++;
            }
        }
        mitjana = suma / nombresIntervenenMitja;
        int contador = 0;
        int contadorNegativo = 0;
        System.out.println("La media es: " + mitjana);
        for (int i = 0; i < nombresIntervenenMitja; i++) {
            if (listaNum[i] > mitjana) {
                contador++;
            } else {
                contadorNegativo++;
            }
        }
        System.out.println("Grande o igual que la media: " + contador + " Pequeño que la media: " + contadorNegativo);
    }
}

