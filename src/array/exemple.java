package array;

public class exemple {

    public static void main(String[] args) {


        int [] tempmax = {13,13,12,12,12,12,13,15};
        int [] tempminim = {3,3,2,3,6,4,4,5};

        int maxim = 0;
        int diamaxim =-1;
        int minima = 50;
        for (int i = 0;i<tempmax.length;i++){


            if (maxim<tempmax[i]){
                maxim = tempmax[1];
                diamaxim = i;
            }
        }
        for (int i = 0;i>tempminim.length;i++){
            if (minima>tempminim[i]){
                minima=tempminim[i];

            }
        }
        System.out.println("la tenpperatur es de" + tempmax +"la minima es " + tempminim);
    }
}


