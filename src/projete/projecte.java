package projete;

import java.util.Random;
import java.util.Scanner;

public class projecte {
    Scanner in = new Scanner(System.in);

    String numero1 = in.next();
    String numeros;
        //Aixi comença el programa/
            while (numero1.equals("1")) {
        System.out.println("que vols malalts o buit?");
        String paraula = in.next();
            //Aqui es per quan el usuari vulgui un taulell buit/
        while (paraula.equals("buit")) {
            System.out.println("Columnes:");
            int columnes = in.nextInt();
            System.out.println("Files:");
            int files = in.nextInt();
            int taulell[][] = new int[columnes][files];
            for (int x = 0; x < columnes; x++) {
                System.out.println();
                for (int i = 0; i < files; i++) {
                    taulell[x][i] = 0;
                    System.out.print(taulell[x][i] + "   ");
                }
            }
            System.out.println();
            System.out.println("Menu:");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                    "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
            System.out.println("Quina opció  vols triar?");
            numeros = in.next();
                //Aqui introdueixo els malalts/
            while (numeros.equals("2")) {
                System.out.println("Has escullit Introduir malalts");
                System.out.println("A quina posició vols ficar malalt?");
                System.out.println("y:");
                int y = in.nextInt();
                System.out.println("x:");
                int x = in.nextInt();
                System.out.println("Numero de personas malaltas");
                int personas = in.nextInt();
                for (int j = 0; j < columnes; j++) {
                    System.out.println();
                    for (int a = 0; a < files; a++) {
                        if (taulell[y][x] == taulell[j][a]) {
                            taulell[y][x] = personas;
                        }
                        System.out.print(taulell[j][a] + "   ");
                    }

                }
                /* Aixo es per si l'usuari introdueix una posició que no esta al taullel no aparegui el misatge de OutOfBounds i se me pari el programa*/
                if (y>columnes||x>files){
                    System.out.println("La posició introduida no correspon amb cap posició del taulell");
                }
                System.out.println();
                System.out.println("Menu:");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                        "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
                System.out.println();
                System.out.println("Quina opció  vols triar?");
                numeros = in.next();
            }
                    //Aqui faig l'apartat de la transmissió de virus/
            while (numeros.equals("3")) {
                System.out.println("Has escullit Transmitir virus");
                System.out.println("Quina taxa de transmisió vols?");
                float taxa = in.nextFloat();
                if (taxa>0) {
                    float taxatranmisió = 0;
                    for (int f = 0; f < columnes; f++) {
                        System.out.println();
                        for (int a = 0; a < files; a++) {
                            if (taulell[f][a] != 0) {
                                taxatranmisió = (taulell[f][a] * taxa) + taulell[f][a];
                                taulell[f][a] = Math.round(taxatranmisió);
                            }
                            System.out.print(taulell[f][a] + "   ");
                        }
                    }
                        //Aqui printo que la taxa no pot ser negativa/
                }else{
                    System.out.println("La taxa introduida ha de ser superior a cero");
                }
                System.out.println();
                System.out.println("Menu:");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                        "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
                System.out.println();
                System.out.println("Quina opció  vols triar?");
                numeros = in.next();

            }
                    //Aquesta es la part de Curar Malalts/
            while (numeros.equals("4")) {
                System.out.println("Has escullit Curar malalts");
                System.out.println("vols aplicarlo globalment o una posicio concreta?(globalment/concreta)");
                String aplicar = in.next();
                    //Aqui faig el cas de quan es globalment(osigui a tot el taulell)/
                if (aplicar.equals("globalment")) {
                    System.out.println("vols que el percentatje sigui random o especificat per tu?(random/especificat)");
                    String aleatorioespecificat = in.next();
                    float percentatjerandom;
                        //Quan el usuari vulgui percentatje random/
                    if (aleatorioespecificat.equals("random")) {
                        percentatjerandom = (float) Math.random() * 100 + 1;
                        System.out.println(percentatjerandom);
                        for (int s = 0; s < columnes; s++) {
                            System.out.println();
                            for (int r = 0; r < files; r++) {
                                float calcul = (taulell[s][r] * percentatjerandom) / 100;
                                float curats = taulell[s][r] - calcul;
                                taulell[s][r] = Math.round(curats);
                                System.out.print(taulell[s][r] + "   ");
                            }

                        }
                    }
                        //Quan el usuari vulgui percentatje posat per ell/
                    if (aleatorioespecificat.equals("especificat")) {
                        System.out.println("escriu el percentatje:");
                        float percentatjespecificat = in.nextFloat();
                        for (int c = 0; c < columnes; c++) {
                            System.out.println();
                            for (int p = 0; p < files; p++) {
                                float calcul = (taulell[c][p] * percentatjespecificat) / 100;
                                float curats = taulell[c][p] - calcul;
                                taulell[c][p] = Math.round(curats);
                                System.out.print(taulell[c][p] + "   ");
                            }

                        }
                    }
                }
                    //Aqui faig el cas de quan es posició concreta/
                if (aplicar.equals("concreta")) {
                    System.out.println("vols un percentatje o un valor concret(percentatje/concret)");
                    String valor = in.next();
                    if (valor.equals("percentatje")) {
                        System.out.println("que vols un percentatje random o un percentatje especific?(random/especific)");
                        String randomespecific = in.next();
                            //Quan el usuari vulgui percentatje random pero en la posició que ell vulgui/
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
                                        float curats = taulell[s][r] - calcul;
                                        taulell[s][r] = Math.round(curats);
                                    }
                                    System.out.print(taulell[s][r] + "   ");
                                }
                            }
                        }
                            //Quan el usuari vulgui percentatje posat per ell pero en la posició que ell vulgui/
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
                                        float curats = taulell[h][l] - calcul;
                                        taulell[h][l] = Math.round(curats);
                                    }
                                    System.out.print(taulell[h][l] + "   ");
                                }
                            }
                        }

                    }
                        //El usuari posa un valor concret de malalts que vol que es curin de la posició que ell indiqui/
                    if (valor.equals("concret")) {
                        System.out.println("en quina posicio vols curar malalts?");
                        System.out.println("y:");
                        int y = in.nextInt();
                        System.out.println("x:");
                        int x = in.nextInt();
                        System.out.println("Introdueix el valor concret que desitji(Sempre menor que el que hagi a la casella)");
                        int valorconcret = in.nextInt();
                        for (int u = 0; u < columnes; u++) {
                            System.out.println();
                            for (int t = 0; t < files; t++) {
                                if (taulell[y][x] == taulell[u][t] && valorconcret <= taulell[u][t]) {
                                    int resta = taulell[u][t] - valorconcret;
                                    taulell[u][t] = resta;
                                }
                                System.out.print(taulell[u][t] + "   ");
                            }
                        }
                    }
                }
                System.out.println();
                System.out.println("Menu:");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                        "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
                System.out.println();
                System.out.println("Quina opció  vols triar?");
                numeros = in.next();
            }
            /*Aqui es la part on podem desplaçar malalts d'una zona a una altra anexa. */
            int valor=0;
            while (numeros.equals("5")) {
                System.out.println("Has escullit Desplaçar malalts");
                System.out.println("Donam les coordenadas de la posició que vols desplaçar malalts");
                System.out.println("y:");
                int cordenaday = in.nextInt();
                System.out.println("x:");
                int cordenadax = in.nextInt();
                if ((cordenaday >= 0||cordenadax >= 0)&&( cordenaday<columnes||cordenadax<files)){
                    System.out.println("Quants malalts vols moure?(el numero ha desplaçar no pot ser superior al número de malalts existents en la casella d'origen.)");
                    valor=in.nextInt();
                    taulell[cordenaday][cordenadax] = taulell[cordenaday][cordenadax] - valor;
                    System.out.println("per desplaçar malalts nomes pots utilitzar els seguents caracters:q, w, e, a, d, z, x, c ");
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
                    taulell[cordenaday][cordenadax]=taulell[cordenaday][cordenadax]+valor;
                    for (int i = 0; i < columnes; i++) {
                        System.out.println();
                        for (int e = 0; e < files; e++) {
                            System.out.print(taulell[i][e] + "   ");
                        }
                    }
                    /* Aixo es per si l'usuari introdueix una posició que no esta al taullel no aparegui el misatge de OutOfBounds i se me pari el programa*/
                }else{
                    System.out.println("La posició ficada resulta fora del taulell,  se li ha perdut la pista al malat o malalts.");
                }
                System.out.println();
                System.out.println("Menu:");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                        "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
                System.out.println();
                System.out.println("Quina opció  vols triar?");
                numeros = in.next();
            }
            while (numeros.equals("6")){
                int suma=0;
                int sumaescapolats=0;
                System.out.println("Has escollit Mostrar informació: ");
                for (int i=0;i<columnes;i++){
                    for (int e=0;e<files;e++){
                        if (taulell[i][e]!=0){
                            suma= suma+taulell[i][e];
                        }
                    }
                }
                System.out.println("Total de malalts:"+ suma);
                for (int a=0;a<columnes;a++){
                    for (int t=0;t<files;t++){
                        if (taulell[a][t]!=0) {
                            sumaescapolats = sumaescapolats + valor;
                        }
                    }
                }
                System.out.println("Total que no ha cumplit el confinament: " + sumaescapolats);

                System.out.println();
                System.out.println("Menu:");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                        "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
                System.out.println();
                System.out.println("Quina opció  vols triar?");
                numeros = in.next();
            }



            if (numeros.equals("7")){
                System.out.println();
                System.out.println("Has sortit del joc");
                System.out.println("Vols tornar-lo a jugar?(si/no)");
                String resposta = in.next();
                if (resposta.equals("si")){
                    System.out.println("Per començar pren 1");
                    numero1 = in.next();
                    System.out.println("que vols malalts o buit?");
                    paraula = in.next();
                }
                if (resposta.equals("no")){
                    System.out.println("Moltes gracies per probar el nostre programa ens veiem de aqui poc");
                    System.exit(0);
                }

            }
        }
        while (paraula.equals("malalts")) {
            int malaltcolumnes = (int) (Math.random() * 5 + 2);
            int malaltsfiles = (int) (Math.random() * 10 + 2);
            int taulell[][] = new int[malaltcolumnes][malaltsfiles];
            java.util.Random InfectatsRandom = new Random();
            for (int x = 0; x <malaltcolumnes; x++) {
                boolean randommalalts = InfectatsRandom.nextBoolean();
                System.out.println();
                for (int i = 0; i < malaltsfiles; i++) {
                    if (randommalalts) {
                        taulell[x][i] = (int) (Math.random() * 9 + 1);
                        System.out.print(taulell[x][i] + "   ");
                        randommalalts = InfectatsRandom.nextBoolean();
                    } else {
                        taulell[x][i] = 0;
                        System.out.print(taulell[x][i] + "   ");
                        randommalalts = InfectatsRandom.nextBoolean();
                    }
                }
            }
            System.out.println();
            System.out.println("Menu:");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus", "Curar malalts",
                    "Desplaçar malalts", "Mostrar informació", "Sortir");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
            System.out.println("Quina opció  vols triar?");
            numeros = in.next();
            while (!numeros.equals("7")) {
                while (numeros.equals("2")) {
                    System.out.println("Has escullit Introduir malalts");
                    System.out.println("A quina posició vols ficar malalt?");
                    System.out.println("y:");
                    int y = in.nextInt();
                    System.out.println("x:");
                    int x = in.nextInt();
                    System.out.println("Numero de personas malaltas");
                    int personas = in.nextInt();
                    for (int j = 0; j < malaltcolumnes; j++) {
                        System.out.println();
                        for (int a = 0; a < malaltsfiles; a++) {
                            if (y<malaltcolumnes&&x<malaltsfiles) {
                                taulell[y][x] = personas;
                                System.out.print(taulell[j][a] + "   ");
                            }

                        }
                    }
                    if (y>malaltcolumnes||x>malaltsfiles){
                        System.out.println("La posició introduida no correspon amb cap posició del taulell");
                    }
                    System.out.println();
                    System.out.println("Menu:");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                            "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
                    System.out.println();
                    System.out.println("Quina opció  vols triar?");
                    numeros = in.next();
                }
                while (numeros.equals("3")) {
                    System.out.println("Has escullit Transmitir virus");
                    System.out.println("Quina taxa de transmisió vols?");
                    float taxa = in.nextFloat();
                    if (taxa>0) {
                        int numero = 0;
                        float taxatranmisió = 0;
                        for (int f = 0; f < malaltcolumnes; f++) {
                            System.out.println();
                            for (int a = 0; a < malaltsfiles; a++) {
                                if (taulell[f][a] != 0) {
                                    taxatranmisió = (taulell[f][a] * taxa) + taulell[f][a];
                                    taulell[f][a] = Math.round(taxatranmisió);
                                }
                                System.out.print(taulell[f][a] + "   ");
                            }
                        }
                    }else{
                        System.out.println("La taxa introduida ha de ser superior a cero");
                    }
                    System.out.println();
                    System.out.println("Menu:");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                            "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
                    System.out.println();
                    System.out.println("Quina opció  vols triar?");
                    numeros = in.next();
                }
                while (numeros.equals("4")) {
                    System.out.println("Has escullit Curar malalts");
                    System.out.println("vols aplicarlo globalment o una posicio concreta?(globalment/concreta)");
                    String globalconcreta = in.next();
                    if (globalconcreta.equals("globalment")) {
                        System.out.println("vols que el percentatje sigui random o especificat per tu?(random/especificat)");
                        String aleatorioespecificat = in.next();
                        float percentatjerandom;
                        if (aleatorioespecificat.equals("random")) {
                            percentatjerandom = (float) Math.random() * 100 + 1;
                            System.out.println(percentatjerandom);
                            for (int s = 0; s < malaltcolumnes; s++) {
                                System.out.println();
                                for (int r = 0; r < malaltsfiles; r++) {
                                    float calcul = (taulell[s][r] * percentatjerandom) / 100;
                                    float curats = taulell[s][r] - calcul;
                                    taulell[s][r] = Math.round(curats);
                                    System.out.print(taulell[s][r] + "   ");
                                }

                            }
                        }
                        if (aleatorioespecificat.equals("especificat")) {
                            System.out.println("escriu el percentatje:");
                            float percentatjespecificat = in.nextFloat();
                            if (percentatjespecificat>0&&percentatjespecificat<100) {
                                for (int c = 0; c < malaltcolumnes; c++) {
                                    System.out.println();
                                    for (int p = 0; p < malaltsfiles; p++) {
                                        float calcul = (taulell[c][p] * percentatjespecificat) / 100;
                                        float curats = taulell[c][p] - calcul;
                                        taulell[c][p] = Math.round(curats);
                                        System.out.print(taulell[c][p] + "   ");
                                    }

                                }
                            }else{
                                System.out.println("El percentatje ha de ser superior a cero i inferior a 100");
                            }
                        }
                    }


                    if (globalconcreta.equals("concreta")) {
                        System.out.println("vols un percentatje o un valor concret(percentatje/concret)");
                        String valor = in.next();
                        if (valor.equals("percentatje")) {
                            System.out.println("que vols un percentatje random o un percentatje especific?(random/especific)");
                            String randomespecific = in.next();
                            if (randomespecific.equals("random")) {
                                System.out.println("en quina posicio vols curar malalts?");
                                System.out.println("y:");
                                int y = in.nextInt();
                                System.out.println("x:");
                                int x = in.nextInt();
                                float randompercentatje = (float) Math.random() * 100 + 1;
                                System.out.println(randompercentatje);
                                for (int s = 0; s < malaltcolumnes; s++) {
                                    System.out.println();
                                    for (int r = 0; r < malaltsfiles; r++) {
                                        if (taulell[y][x] == taulell[s][r]) {
                                            float calcul = (taulell[s][r] * randompercentatje) / 100;
                                            float curats = taulell[s][r] - calcul;
                                            taulell[s][r] = Math.round(curats);
                                        }
                                        System.out.print(taulell[s][r] + "   ");
                                    }
                                }
                            }

                            if (randomespecific.equals("especific")) {
                                System.out.println("en quina posicio vols curar malalts?");
                                System.out.println("y:");
                                int y = in.nextInt();
                                System.out.println("x:");
                                int x = in.nextInt();
                                System.out.println("Escriu el percentatje:");
                                float percentatje = in.nextFloat();
                                if (percentatje>0&&percentatje<100) {

                                    for (int h = 0; h < malaltcolumnes; h++) {
                                        System.out.println();
                                        for (int l = 0; l < malaltsfiles; l++) {
                                            if (taulell[y][x] == taulell[h][l]) {
                                                float calcul = (taulell[h][l] * percentatje) / 100;
                                                float curats = taulell[h][l] - calcul;
                                                taulell[h][l] = Math.round(curats);
                                            }
                                            System.out.print(taulell[h][l] + "   ");
                                        }
                                    }
                                }else{
                                    System.out.println("El percentatje introduit ha de ser major que 0 i menor que 100");
                                }
                            }
                        }
                        if (valor.equals("concret")) {
                            System.out.println("en quina posicio vols curar malalts?");
                            System.out.println("y:");
                            int y = in.nextInt();
                            System.out.println("x:");
                            int x = in.nextInt();
                            System.out.println("Introdueix el valor concret que desitji(Sempre menor que el que hagi a la casella)");
                            int valorconcret = in.nextInt();
                            for (int u = 0; u < malaltcolumnes; u++) {
                                System.out.println();
                                for (int t = 0; t < malaltsfiles; t++) {
                                    if (taulell[y][x] == taulell[u][t] && valorconcret <= taulell[u][t]) {
                                        int resta = taulell[u][t] - valorconcret;
                                        taulell[u][t] = resta;
                                    }
                                    System.out.print(taulell[u][t] + "   ");
                                }
                            }
                        }

                    }
                    System.out.println();
                    System.out.println("Menu:");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                            "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
                    System.out.println();
                    System.out.println("Quina opció  vols triar?");
                    numeros = in.next();
                }
                while (numeros.equals("5")) {
                    System.out.println("Has escullit Desplaçar malalts");
                    System.out.println("Donam les coordenadas de la posició que vols desplaçar malalts");
                    System.out.println("y:");
                    int cordenaday = in.nextInt();
                    System.out.println("x:");
                    int cordenadax = in.nextInt();
                    if ((cordenaday >= 0||cordenadax >= 0)&&( cordenaday<malaltcolumnes||cordenadax<malaltsfiles)) {
                        System.out.println("Quants malalts vols moure?(el numero ha desplaçar no pot ser superior al número de malalts existents en la casella d'origen.)");
                        int valor = in.nextInt();
                        taulell[cordenaday][cordenadax] = taulell[cordenaday][cordenadax] - valor;
                        System.out.println("per desplaçar malalts nomes pots utilitzar els seguents caracters:q, w, e, a, d, z, x, c " +
                                "(introdueix una lletra o una cadena formada per aquestes lletres)");
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
                        for (int i = 0; i < malaltcolumnes; i++) {
                            System.out.println();
                            for (int e = 0; e < malaltsfiles; e++) {


                                System.out.print(taulell[i][e] + "   ");
                            }
                        }
                    }else{
                        System.out.println("La posició ficada resulta fora del taulell,  se li ha perdut la pista al malat o malalts.");
                    }
                    System.out.println();
                    System.out.println("Menu:");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Carregar taulell", "Introduir malalts", "Transmitir virus",
                            "Curar malalts", "Desplaçar malalts", "Mostrar informació", "Sortir");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "7 i dir que si", "2", "3", "4", "5", "6", "7");
                    System.out.println();
                    System.out.println("Quina opció  vols triar?");
                    numeros = in.next();
                }

            }
            if (numeros.equals("7")){
                System.out.println();
                System.out.println("Has sortit del joc");
                System.out.println("Vols tornar-lo a jugar?(si/no)");
                String resposta = in.next();
                if (resposta.equals("si")){
                    System.out.println("Per començar pren 1");
                    numero1 = in.next();
                    System.out.println("que vols malalts o buit?");
                    paraula = in.next();
                }
                if (resposta.equals("no")){
                    System.out.println("Moltes gracies per probar el nostre programa ens veiem de aqui poc");
                    System.exit(0);
                }

            }
        }
    }
}
