package ru.mirea.Lab2.task5;

public class testDog {
    public testDog(){}

    public static void main(String[] args){
        Dog d1 = new Dog("Barsik", 3);
        Dog d2 = new Dog("Bobic", 10);
        Dog d3 = new Dog("Lucky");
        d3.setAge(1);
        System.out.print(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
