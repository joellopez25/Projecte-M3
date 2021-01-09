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
            while (resposta.equals("si")) {
            System.out.println("A quina posició vols ficar malalt?");
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println("Numero de personas malaltas");
            int personas = in.nextInt();
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
            System.out.println();
            System.out.println("vols aplicarlo globalment o una posicio concreta?(globalment/concreta)");
            String aplicar = in.next();

            if (aplicar.equals("globalment")) {
                System.out.println("vols que el percentatje sigui random o especificat per tu?(random/especificat)");
                String aleatorioespecificat = in.next();
                float percentatjerandom;
                if (aleatorioespecificat.equals("random")) {
                    percentatjerandom = (float) Math.random() * 100 + 1;
                    System.out.println(percentatjerandom);
                    for (int s = 0; s < files; s++) {
                        System.out.println();
                        for (int r = 0; r < columnes; r++) {
                            float calcul = (taulell[s][r] * percentatjerandom) / 100;
                            float curats = taulell[s][r] - calcul;
                            taulell[s][r] = Math.round(curats);
                            System.out.print(taulell[s][r] + " ");
                        }

                    }
                }
                if (aleatorioespecificat.equals("especificat")) {
                    System.out.println("escriu el percentatje:");
                    float percentatjespecificat = in.nextFloat();
                    for (int c = 0; c < files; c++) {
                        System.out.println();
                        for (int p = 0; p < columnes; p++) {
                            float calcul = (taulell[c][p] * percentatjespecificat) / 100;
                            float curats = taulell[c][p] - calcul;
                            taulell[c][p] = Math.round(curats);
                            System.out.print(taulell[c][p] + " ");
                        }

                    }
                }

            }

            if (aplicar.equals("concreta")) {
                System.out.println("vols un percentatje o un valor concret(percentatje/concret)");
                String valor = in.next();
                if (valor.equals("percentatje")) {
                    System.out.println("que vols un percentatje random o un percentatje especific?(random/especific)");
                    String randomespecific = in.next();
                    while (randomespecific.equals("random")) {
                        System.out.println("en quina posicio vols curar malalts?");
                        int x = in.nextInt();
                        int y = in.nextInt();
                        float randompercentatje = (float) Math.random() * 100 + 1;
                        System.out.println(randompercentatje);
                        for (int s = 0; s < files; s++) {
                            System.out.println();
                            for (int r = 0; r < columnes; r++) {
                                if (taulell[x][y] == taulell[s][r]) {
                                    float calcul = (taulell[s][r] * randompercentatje) / 100;
                                    float curats = taulell[s][r] - calcul;
                                    taulell[s][r] = Math.round(curats);
                                }
                                System.out.print(taulell[s][r] + " ");
                            }
                        }
                        System.out.println("que vols un percentatje random o un percentatje especific?(random/especific)");
                        randomespecific = in.next();
                    }
                    
                        if (randomespecific.equals("especific")) {
                            System.out.println("en quina posicio vols curar malalts?");
                            int x = in.nextInt();
                            int y = in.nextInt();
                            float percentatje = in.nextFloat();
                            for (int h = 0; h < files; h++) {
                                System.out.println();
                                for (int l = 0; l < columnes; l++) {
                                    if (taulell[x][y] == taulell[h][l]) {
                                        float calcul = (taulell[h][l] * percentatje) / 100;
                                        float curats = taulell[h][l] - calcul;
                                        taulell[h][l] = Math.round(curats);
                                    }
                                    System.out.print(taulell[h][l] + " ");
                                }
                            }
                        }
                    System.out.println("que vols un percentatje random o un percentatje especific?(random/especific)");
                    randomespecific = in.next();
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

