package bucles;

import java.util.Scanner;

public class avançat7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int position = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                position = i;
                break;
            }
        }
        int i = 0;
        while (i < s.length() && s.charAt(i) != ' ') {
            i++;
        }
    }
}