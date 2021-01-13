package projete;

import java.util.Random;
import java.util.Scanner;

public class projecte {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Per utilitzar el programa posa començar:");
        String start = in.next();
        String numeros = "0";
        System.out.println();
        System.out.println("Menu:");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "1", "2", "3", "4", "5", "6", "7");
        System.out.println();
        System.out.println("Quina opció  vols triar?");
        numeros = in.next();
        int columnes = 0;
        int files = 0;
        int[][] taulell = new int[columnes][files];
        /*Aixi comença el programa*/
        while (start.equals("començar")) {
            /*Aqui carreguem el taulell*/
            while (numeros.equals("1")) {
                System.out.println("que vols malalts o buit?");
                String paraula = in.next();
                /*Aqui es per quan el usuari vulgui un taulell buit*/
                if (paraula.equals("buit")) {
                    System.out.println("Columnes:");
                    columnes = in.nextInt();
                    System.out.println("Files:");
                    files = in.nextInt();
                    taulell = new int[columnes][files];
                    for (int x = 0; x < columnes; x++) {
                        System.out.println();
                        for (int i = 0; i < files; i++) {
                            taulell[x][i] = 0;
                            System.out.print(taulell[x][i] + "\t");
                        }
                    }
                    System.out.println();
                    System.out.println("Menu:");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                            "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "1", "2", "3", "4", "5", "6", "7");
                    System.out.println();
                    System.out.println("Quina opció  vols triar?");
                    numeros = in.next();
                }
                /*Aqui es per quan el usuari vulgui un taulell amb malalts ja introduits*/
                if (paraula.equals("malalts")) {
                    System.out.println("Columnes:");
                    columnes = in.nextInt();
                    System.out.println("Files:");
                    files = in.nextInt();
                    taulell = new int[columnes][files];
                    java.util.Random InfectatsRandom = new Random();
                    for (int x = 0; x < columnes; x++) {
                        boolean randommalalts = InfectatsRandom.nextBoolean();
                        System.out.println();
                        for (int i = 0; i < files; i++) {
                            if (randommalalts) {
                                taulell[x][i] = (int) (Math.random() * 50 + 1);
                                System.out.print(taulell[x][i] + "\t");
                                randommalalts = InfectatsRandom.nextBoolean();
                            } else {
                                taulell[x][i] = 0;
                                System.out.print(taulell[x][i] + "\t");
                                randommalalts = InfectatsRandom.nextBoolean();
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("Menu:");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                            "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "1", "2", "3", "4", "5", "6", "7");
                    System.out.println();
                    System.out.println("Quina opció  vols triar?");
                    numeros = in.next();
                }
            }

            /*Aqui introdueixo els malalts*/
            while (numeros.equals("2")) {
                System.out.println("Has escullit Introduir malalts");
                System.out.println("A quina posició vols ficar malalt?");
                System.out.println("y:");
                int y = in.nextInt();
                System.out.println("x:");
                int x = in.nextInt();
                if (y < columnes && x < files) {
                    System.out.println("Numero de personas malaltas:");
                    int personas = in.nextInt();
                    for (int j = 0; j < columnes; j++) {
                        System.out.println();
                        for (int a = 0; a < files; a++) {
                            if (taulell[y][x] == taulell[j][a]) {
                                taulell[y][x] = personas;
                            }
                            System.out.print(taulell[j][a] + "\t");
                        }

                    }
                }
                /* Aixo es per si l'usuari introdueix una posició que no esta al taullel no aparegui el misatge de OutOfBounds i se me pari el programa*/
                if (y > columnes && x > files) {
                    System.out.println("La posició introduida no correspon amb cap posició del taulell");
                }
                System.out.println();
                System.out.println("Menu:");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                        "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "1", "2", "3", "4", "5", "6", "7");
                System.out.println();
                System.out.println("Quina opció  vols triar?");
                numeros = in.next();
            }
            /*Aqui faig l'apartat de la transmissió de virus*/
            while (numeros.equals("3")) {
                System.out.println("Has escullit Transmitir virus");
                System.out.println("Quina taxa de transmisió vols?");
                float taxa = in.nextFloat();
                if (taxa > 0) {
                    float taxatranmisió = 0;
                    for (int f = 0; f < columnes; f++) {
                        System.out.println();
                        for (int a = 0; a < files; a++) {
                            if (taulell[f][a] != 0) {
                                taxatranmisió = (taulell[f][a] * taxa) + taulell[f][a];
                                taulell[f][a] = Math.round(taxatranmisió);
                            }
                            System.out.print(taulell[f][a] + "\t");
                        }
                    }
                    /*Aqui faig que la taxa no pot ser negativa*/
                } else {
                    System.out.println("La taxa introduida ha de ser superior a cero");
                }
                System.out.println();
                System.out.println("Menu:");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                        "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "1", "2", "3", "4", "5", "6", "7");
                System.out.println();
                System.out.println("Quina opció  vols triar?");
                numeros = in.next();

            }
            /*Aquesta es la part de Curar Malalts*/
            float totalcurats = 0;
            while (numeros.equals("4")) {
                System.out.println("Has escullit Curar malalts");
                System.out.println("vols aplicarlo globalment o una posicio concreta?(globalment/concreta)");
                String aplicar = in.next();
                /*Aqui faig el cas de quan es globalment(osigui a tot el taulell)*/
                if (aplicar.equals("globalment")) {
                    System.out.println("vols que el percentatje sigui random o especificat per tu?(random/especificat)");
                    String aleatorioespecificat = in.next();
                    float percentatjerandom;
                    /*Quan el usuari vulgui percentatje random*/
                    if (aleatorioespecificat.equals("random")) {
                        percentatjerandom = (float) Math.random() * 100 + 1;
                        System.out.println(percentatjerandom);
                        for (int s = 0; s < columnes; s++) {
                            System.out.println();
                            for (int r = 0; r < files; r++) {
                                float calcul = (taulell[s][r] * percentatjerandom) / 100;
                                totalcurats = totalcurats + calcul;
                                float curats = taulell[s][r] - calcul;
                                taulell[s][r] = Math.round(curats);
                                System.out.print(taulell[s][r] + "\t");
                            }

                        }
                    }
                    /*Quan el usuari vulgui percentatje posat per ell*/
                    if (aleatorioespecificat.equals("especificat")) {
                        System.out.println("escriu el percentatje:");
                        float percentatjespecificat = in.nextFloat();
                        for (int c = 0; c < columnes; c++) {
                            System.out.println();
                            for (int p = 0; p < files; p++) {
                                float calcul = (taulell[c][p] * percentatjespecificat) / 100;
                                totalcurats = totalcurats + calcul;
                                float curats = taulell[c][p] - calcul;
                                taulell[c][p] = Math.round(curats);
                                System.out.print(taulell[c][p] + "\t");
                            }

                        }
                    }
                }
                /*Aqui faig el cas de quan es posició concreta*/
                if (aplicar.equals("concreta")) {
                    System.out.println("vols un percentatje o un valor concret(percentatje/concret)");
                    String valor = in.next();
                    if (valor.equals("percentatje")) {
                        System.out.println("que vols un percentatje random o un percentatje especific?(random/especific)");
                        String randomespecific = in.next();
                        /*Quan el usuari vulgui percentatje random pero en la posició que ell vulgui*/
                        if (randomespecific.equals("random")) {
                            System.out.println("en quina posicio vols curar malalts?");
                            System.out.println("y:");
                            int y = in.nextInt();
                            System.out.println("x:");
                            int x = in.nextInt();
                            float randompercentatje = (float) Math.random() * 100 + 1;
                            System.out.println(randompercentatje);
                            for (int s = 0; s < columnes; s++) {
                                System.out.println();
                                for (int r = 0; r < files; r++) {
                                    if (taulell[y][x] == taulell[s][r]) {
                                        float calcul = (taulell[s][r] * randompercentatje) / 100;
                                        totalcurats = totalcurats + calcul;
                                        float curats = taulell[s][r] - calcul;
                                        taulell[s][r] = Math.round(curats);
                                    }
                                    System.out.print(taulell[s][r] + "\t");
                                }
                            }
                        }
                        /*Quan el usuari vulgui percentatje posat per ell pero en la posició que ell vulgui*/
                        if (randomespecific.equals("especific")) {
                            System.out.println("en quina posicio vols curar malalts?");
                            System.out.println("y:");
                            int y = in.nextInt();
                            System.out.println("x:");
                            int x = in.nextInt();
                            System.out.println("Escriu el percentatje:");
                            float percentatje = in.nextFloat();
                            for (int h = 0; h < columnes; h++) {
                                System.out.println();
                                for (int l = 0; l < files; l++) {
                                    if (taulell[y][x] == taulell[h][l]) {
                                        float calcul = (taulell[h][l] * percentatje) / 100;
                                        totalcurats = totalcurats + calcul;
                                        float curats = taulell[h][l] - calcul;
                                        taulell[h][l] = Math.round(curats);
                                    }
                                    System.out.print(taulell[h][l] + "\t");
                                }
                            }
                        }

                    }
                    /*El usuari posa un valor concret de malalts que vol que es curin de la posició que ell indiqui*/
                    if (valor.equals("concret")) {
                        System.out.println("en quina posicio vols curar malalts?");
                        System.out.println("y:");
                        int y = in.nextInt();
                        System.out.println("x:");
                        int x = in.nextInt();
                        System.out.println("Introdueix el valor concret que desitji(Sempre menor que el que hagi a la casella)");
                        int valorconcret = in.nextInt();
                        totalcurats = totalcurats + valorconcret;
                        for (int u = 0; u < columnes; u++) {
                            System.out.println();
                            for (int t = 0; t < files; t++) {
                                if (taulell[y][x] == taulell[u][t] && valorconcret <= taulell[u][t]) {
                                    int resta = taulell[u][t] - valorconcret;
                                    taulell[u][t] = resta;
                                }
                                System.out.print(taulell[u][t] + "\t");
                            }
                        }
                    }
                }
                System.out.println();
                System.out.println("Menu:");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                        "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "1", "2", "3", "4", "5", "6", "7");
                System.out.println();
                System.out.println("Quina opció  vols triar?");
                numeros = in.next();
            }
            /*Aqui es la part on podem desplaçar malalts d'una zona a una altra anexa. */
            int escapats = 0;
            int valor = 0;
            int sumaescapolats = 0;
            while (numeros.equals("5")) {
                System.out.println("Has escullit Desplaçar malalts");
                System.out.println("Donam les coordenadas de la posició que vols desplaçar malalts");
                System.out.println("y:");
                int cordenaday = in.nextInt();
                System.out.println("x:");
                int cordenadax = in.nextInt();
                System.out.println("Quants malalts vols moure?(el numero ha desplaçar no pot ser superior al número de malalts existents en la casella d'origen.)");
                valor = in.nextInt();
                if ((cordenaday >= 0 || cordenadax >= 0) && (cordenaday < columnes || cordenadax < files)) {
                    sumaescapolats = sumaescapolats + valor;
                    taulell[cordenaday][cordenadax] = taulell[cordenaday][cordenadax] - valor;
                    System.out.println("per desplaçar malalts nomes pots utilitzar les seguents lletres : q (dalt esquerra), w (dalt mig), e (dalt dreta), " +
                            "a (esquerra mig), d (dreta mig), z (baix esquerra), x (baix mig), c (baix dreta). ");
                    String lletra = in.next();
                    if (lletra.equals("q")) {
                        cordenadax = cordenadax - 1;
                        cordenaday = cordenaday - 1;
                    } else if (lletra.equals("w")) {
                        cordenaday = cordenaday - 1;
                    } else if (lletra.equals("e")) {
                        cordenadax = cordenadax + 1;
                        cordenaday = cordenaday - 1;
                    } else if (lletra.equals("a")) {
                        cordenadax = cordenadax - 1;
                    } else if (lletra.equals("d")) {
                        cordenadax = cordenadax + 1;
                    } else if (lletra.equals("z")) {
                        cordenadax = cordenadax - 1;
                        cordenaday = cordenaday + 1;
                    } else if (lletra.equals("x")) {
                        cordenaday = cordenaday + 1;
                    } else if (lletra.equals("c")) {
                        cordenadax = cordenadax + 1;
                        cordenaday = cordenaday + 1;
                    }
                    taulell[cordenaday][cordenadax] = taulell[cordenaday][cordenadax] + valor;
                    for (int i = 0; i < columnes; i++) {
                        System.out.println();
                        for (int e = 0; e < files; e++) {
                            System.out.print(taulell[i][e] + "\t");
                        }
                    }
                    /* Aixo es per si l'usuari introdueix una posició que no esta al taullel no aparegui el misatge de OutOfBounds i se me pari el programa*/
                } else {
                    escapats = escapats + valor;
                    System.out.println("La posició ficada resulta fora del taulell,  se li ha perdut la pista al malat o malalts.");
                }
                System.out.println();
                System.out.println("Menu:");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                        "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "1", "2", "3", "4", "5", "6", "7");
                System.out.println();
                System.out.println("Quina opció  vols triar?");
                numeros = in.next();
            }
            /*mostrar l'estat del taulell actual indicant el número total de malalts, persones curades i el percentatge que no ha complit el confinament.*/
            while (numeros.equals("6")) {
                int suma = 0;
                System.out.println("Has escollit Mostrar informació: ");
                for (int i = 0; i < columnes; i++) {
                    for (int e = 0; e < files; e++) {
                        if (taulell[i][e] != 0) {
                            suma = suma + taulell[i][e];
                        }
                    }
                }
                System.out.println("Total de malalts:" + suma);
                System.out.println("Total que no ha cumplit el confinament: " + sumaescapolats);
                System.out.println("El total de gent que se ha escapat es:" + escapats);
                System.out.println("El total de malalts curats es: " + Math.round(totalcurats));
                System.out.println();
                System.out.println("Menu:");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                        "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "1", "2", "3", "4", "5", "6", "7");
                System.out.println();
                System.out.println("Quina opció  vols triar?");
                numeros = in.next();
            }


            /*Aquesta es la meva prposta de millora a el enunciat*/
            if (numeros.equals("7")) {
                System.out.println();
                System.out.println("Has sortit del joc");
                System.out.println("Vols tornar-lo a jugar?(si)/(no)");
                String resposta = in.next();
                if (resposta.equals("si")) {
                    System.out.println();
                    System.out.println("Menu:");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                            "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "1", "2", "3", "4", "5", "6", "7");
                    System.out.println();
                    System.out.println("Quina opció  vols triar?");
                    numeros = in.next();
                }
                if (resposta.equals("no")) {
                    System.out.println("Moltes gracies per probar el nostre programa ens veiem de aqui poc");
                    System.exit(0);
                }

            }
        }
    }
}
