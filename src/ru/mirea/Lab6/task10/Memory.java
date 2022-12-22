package ru.mirea.Lab6.task10;
public class Memory {
    private int sizeInGB;

    public int getSizeInGB() {
        return sizeInGB;
    }

    public void setSizeInGB(int sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    public Memory(int sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    @Override
    public String toString() {
        return "объём в ГБ=" + sizeInGB;
    }
}
