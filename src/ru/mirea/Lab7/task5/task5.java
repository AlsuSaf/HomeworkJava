package ru.mirea.Lab7.task5;

public class task5 {
    public static void main(String[] args) {
        ProcessStrings ps = new ProcessStrings();
        String test = "123456 123";
        System.out.println(ps.getStringLength(test));
        System.out.println(ps.getSymbolsAtOddPos(test));
        System.out.println(ps.reverseString(test));
    }
}
