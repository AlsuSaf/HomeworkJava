package ru.mirea.Lab6.task10;

public class Monitor {
    private String resolution;

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Monitor(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return  "разрешение=" + resolution;
    }
}