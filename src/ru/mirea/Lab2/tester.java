package ru.mirea.Lab2;
//
public class tester {
    public static void main(String[] args){
        Ball ball = new Ball(4);
        ball.info_ball();
    }
}

class Ball {
    int radius, diametr;
    Ball(int radius) {
        this.radius = radius;
        this.diametr = this.radius * 2;
        System.out.println("\n[+] Ball object was created");
    }
    void info_ball() {
        System.out.print("Radius: ");
        System.out.println(this.radius);
        System.out.print("Diametr: ");
        System.out.println(this.diametr);
    }
}