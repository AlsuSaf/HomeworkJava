package ru.mirea.Lab2.task2;

public class Ball {
    private double x;
    private double y;

    public void Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){
        x = 5.0;
        y = 4.0;
    }

    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double Xdisp, double Ydisp){
        x += Xdisp;
        y += Ydisp;
    }

    public String toString(){
        return "Ball: " + x + ", " + y;
    }

    public static void main(String[] args){
        Ball b = new Ball();
        System.out.println(b);
    }

}
