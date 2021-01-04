package array;

import java.util.Arrays;

public class ex13 {
    public static void main(String[] args) {
        int [] llista1 = {1,1,1,1};
        int [] llista2 = {2,2,2,2,2};
        int [] llista3 = new int[9];
        int contador = 0;
        int verificador = 0;

        if (llista1.length < llista2.length) {
            verificador = llista2.length;
        }
        else {
            verificador = llista1.length;
        }
        for (int i = 0; i < verificador; i++) {
            if (i < llista1.length && 1 < llista2.length) {
                llista3 [contador] = llista1 [i];
                llista3 [contador + 1] = llista2 [i];
                contador += 2;
            }
            else if (i > llista1.length -1) {
                llista3 [contador] = llista2 [i];
                contador++;
            }
            else if (i > llista2.length -1) {
                llista3 [contador] = llista1 [i];
                contador++;
            }
        }
        System.out.println(Arrays.toString(llista3));
    }
}

