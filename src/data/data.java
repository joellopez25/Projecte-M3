package data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate inicio = LocalDate.now();
        LocalDate fin = LocalDate.of(2020, 10, 31);
        long dias = inicio.until(fin, ChronoUnit.DAYS);
        System.out.println("Numero de dias que falten: " + dias);

    }
}
