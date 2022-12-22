package ru.mirea.Lab3.transpan;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        System.out.println("Ввести сумму в рублях:");
        Scanner sc = new Scanner(System.in);
        double sum_begin = sc.nextDouble();

        double sum_end = sum_begin / 62.57;
        NumberFormat.getInstance(Locale.US);

        NumberFormat numberFormat1 =
                NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("В Америке: "  + numberFormat1.format(sum_end));

    }
}
