package ru.mirea.Lab2.task5;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a){ //конструктор
        this.name = n;
        this.age = a;
    }

    public Dog(String n){
        this.name = n;
        this.age = 0;
    }

    public Dog(){
        this.name = "Puppy";
        this.age = 0;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return this.name + ", age " + this.age;
    }

    public void intoHumanAge(){
        System.out.println(this.name + "'s age in human years is " + this.age * 7 + " years");
    }
}

