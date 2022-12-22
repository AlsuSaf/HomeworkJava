package ru.mirea.Lab6.task11;

public class Farengeit implements Convertable {
    @Override
    public double convert(double measure) {
        return measure * 1.8 + 32;
    }
}