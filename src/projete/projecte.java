package projete;

import java.util.Random;
import java.util.Scanner;

public class projecte {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("que vols malalts o buit?");
        String paraula = in.next();

        if (paraula.equals("buit")) {
            int files = in.nextInt();
            int columnes = in.nextInt();
            int taulell[][] = new int[files][columnes];
            int countbuit = 0;
            for (int x = 0; x < files; x++) {
                System.out.println();
                for (int i = 0; i < columnes; i++) {
                    taulell[x][i] = 0;
                    System.out.print(taulell[x][i]);
                }
            }
            System.out.println();
            System.out.println("Vols introduir malalts?(si/no)");
            String resposta = in.next();
            System.out.println("A quina posició vols ficar malalt?");
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println("Numero de personas malaltas");
            int personas = in.nextInt();
            while (resposta.equals("si")) {
                for (int j = 0; j < files; j++) {
                    System.out.println();
                    for (int a = 0; a < columnes; a++) {
                        if (taulell[x][y] == taulell[j][a]) {
                            taulell[x][y] = personas;
                        }
                        System.out.print(taulell[j][a]);
                    }

                }
                System.out.println();
                System.out.println("Vols  introduir malalts?(si/no)");
                resposta = in.next();
                System.out.println("Quina posició vols ficar malalt?");
                x = in.nextInt();
                y = in.nextInt();
                System.out.println("Numero de personas malaltas");
                personas = in.nextInt();
            }
            System.out.println("Quina taxa de transmisió vols?");
            float taxa = in.nextFloat();
            int numero = 0;
            float taxatranmisió = 0;
            if (resposta.equals("no")) {
                for (int f = 0; f < files; f++) {
                    System.out.println();
                    for (int a = 0; a < columnes; a++) {
                        if (taulell[f][a] != 0) {
                            taxatranmisió = (taulell[f][a] * taxa) + taulell[f][a];
                            taulell[f][a] = Math.round(taxatranmisió);
                        }
                        System.out.print(taulell[f][a] + " ");
                    }
                }
            }


        }
        if (paraula.equals("malalts")) {
            int malaltfiles = (int) (Math.random() * 5 + 2);
            int malaltscolumnes = (int) (Math.random() * 10 + 2);
            int taulell[][] = new int[malaltfiles][malaltscolumnes];
            java.util.Random InfectatsRandom = new Random();
            for (int x = 0; x < malaltfiles; x++) {
                boolean randommalalts = InfectatsRandom.nextBoolean();
                System.out.println();
                for (int i = 0; i < malaltscolumnes; i++) {
                    if (randommalalts) {
                        taulell[x][i] = (int) (Math.random() * 9 + 1);
                        System.out.print(taulell[x][i] + " ");
                        randommalalts = InfectatsRandom.nextBoolean();
                    } else {
                        taulell[x][i] = 0;
                        System.out.print(taulell[x][i] + " ");
                        randommalalts = InfectatsRandom.nextBoolean();
                    }
                }
            }
            System.out.println();
            System.out.println("Vols introduir malalts?(si/no)");
            String resposta = in.next();
            System.out.println("A quina posició vols ficar malalt?");
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println("Numero de personas malaltas");
            int personas = in.nextInt();
            while (resposta.equals("si")) {
                for (int j = 0; j < malaltfiles; j++) {
                    System.out.println();
                    for (int a = 0; a < malaltscolumnes; a++) {
                        if (taulell[x][y] == taulell[j][a]) {
                            taulell[x][y] = personas;
                        }
                        System.out.print(taulell[j][a] + " ");
                    }
                }
                System.out.println();
                System.out.println("Vols  introduir malalts?(si/no)");
                resposta = in.next();
                System.out.println("Quina posició vols ficar malalt?");
                x = in.nextInt();
                y = in.nextInt();
                System.out.println("Numero de personas malaltas");
                personas = in.nextInt();
            }
            System.out.println("Quina taxa de transmisió vols?");
            float taxa = in.nextFloat();
            int numero = 0;
            float taxatranmisió = 0;
            if (resposta.equals("no")) {
                for (int f = 0; f < malaltfiles; f++) {
                    System.out.println();
                    for (int a = 0; a < malaltscolumnes; a++) {
                        if (taulell[f][a] != 0) {
                            taxatranmisió = (taulell[f][a] * taxa) + taulell[f][a];
                            taulell[f][a] = Math.round(taxatranmisió);
                        }
                        System.out.print(taulell[f][a] + " ");
                    }
                }
            }

        }
    }
}

