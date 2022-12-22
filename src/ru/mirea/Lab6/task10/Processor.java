package ru.mirea.Lab6.task10;

public class Processor {
    private int coresNum;

    public Processor(int coresNum) {
        this.coresNum = coresNum;
    }

    public int getCoresNum() {
        return coresNum;
    }


    public void setCoresNum(int coresNum) {
        this.coresNum = coresNum;
    }

    @Override
    public String toString() {
        return "число ядер=" + coresNum;
    }
}