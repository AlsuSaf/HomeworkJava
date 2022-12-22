package ru.mirea.Lab3.task1;
import java.util.Random;

public class RandMas {
    public static void main(String[] args) {
       Random rand = new Random();
       double[] mas = new double[10];

       for(int i = 0; i < 10; i++){
           if (i == 9){
               mas[i] = rand.nextDouble();
               System.out.println(mas[i]);
           }
           else {
               mas[i] = rand.nextDouble();
               System.out.print(mas[i] + "; ");
           }
       }

        for(int j = 0; j < 9; j++){
            if (mas[j] > mas[j + 1]){
                double tmp = mas[j];
                mas[j] = mas[j + 1];
                mas[j + 1] = tmp;
            }
        }

        for(int k = 0; k < 10; k++){
            System.out.print(mas[k] + "; ");
        }
    }
}
