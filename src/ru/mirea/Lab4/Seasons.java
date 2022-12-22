package ru.mirea.Lab4;
import java.util.Scanner;

public class Seasons {
    enum Season{
        WINTER(-25), SPRING(7), SUMMER(25), AUTUMN(13);
        private int temp;
        Season(int temp) {
            this.temp = temp;
        }
        public int getTemp(){
            return temp;
        }
    }

    public static void main(String[] args) {
        Season arraySeas[] = Season.values();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter favourite season: 1 - winter, 2 - spring, 3 - summer, 4 - autumn ");
        int numSeason = in.nextInt();
        Season season = Season.WINTER;
        switch (numSeason) {
            case 1:
                season = Season.WINTER;
                System.out.println("I love winter");
                break;
            case 2:
                season = Season.SPRING;
                System.out.println("I love spring");
                break;
            case 3:
                season = Season.SUMMER;
                System.out.println("I love summer");
                break;
            case 4:
                season = Season.AUTUMN;
                System.out.println("I love autumn");
                break;
            default:
                System.out.println("Incorrect enter. Auto set 'Winter'.");
        }
        System.out.println("temp: " + season.getTemp());
        System.out.println("All info:");
        for (int i = 0; i < arraySeas.length; i++){
            System.out.println(arraySeas[i] + ": " + arraySeas[i].getTemp());
        }
    }

}
