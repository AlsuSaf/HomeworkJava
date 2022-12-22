package ru.mirea.Lab6.task10;

public enum ComputerBrands {
    SONY,
    INTEL,
    APPLE,
    LINUX;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}