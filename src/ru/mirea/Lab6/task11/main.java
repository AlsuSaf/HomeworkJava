package ru.mirea.Lab6.task11;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Farengeit Far = new Farengeit();
        Kelvin Kel = new Kelvin();
        System.out.print("Введите значение температуры в градусах Цельсия: ");
        Scanner sc = new Scanner(System.in);
        double cels = sc.nextDouble();
        System.out.println("Температура в градусах Фаренгейта: " + Far.convert(cels));
        System.out.println("Температура в градусах Кельвина: " + Kel.convert(cels));
    }
}
