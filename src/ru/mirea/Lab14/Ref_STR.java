package ru.mirea.Lab14;
import java.util.Scanner;
import java.util.Arrays;

public class Ref_STR {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введите паттерн: ");
        String p = sc.nextLine();
        System.out.println(Arrays.toString(str.split(p)));
    }
}