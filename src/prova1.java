
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class prova1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDateTime dataNaix = LocalDateTime.of(2001,12,30,02,45);
       String s = dataNaix.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm"));
        System.out.println(s);
    }

}