package ru.mirea.Lab6.task11;

public class Kelvin implements Convertable{
    @Override
    public double convert(double measure) {
        return measure + 273.15;
    }
}