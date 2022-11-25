package ru.mirea.Lab1;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.ArrayIndexOutOfBoundsException;

/*public class massiv { //3
    public static void main(String[] args){
        int[] mas = {5, 10, 12, 14};
        int summ = 0;
        int n = mas.length;
        for (int i = 0; i < n; i++){
            summ += mas[i];
        }
        float sred = (summ / n);
        System.out.println(summ);
        System.out.print(sred);
    }
}


public class massiv{ //4_1
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        int sum = 0;
        int i = 0;
        int maxx = 0, minn = 1000;
        while(numbers.length != i){
            sum += Integer.parseInt(numbers[i]);
            i++;
        }
        for(int j = 0; j < numbers.length; j++){
            if(maxx < Integer.parseInt(numbers[j])){
                maxx = Integer.parseInt(numbers[j]);
            }
            if (Integer.parseInt(numbers[j]) < minn){
                minn = Integer.parseInt(numbers[j]);
            }
        }

        System.out.println(sum);
        System.out.println(maxx);
        System.out.println(minn);
    }
}

public class massiv{ //4_2
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        int sum = 0;
        int i = 0;
        int maxx = 0, minn = 1000;
        do{
            sum += Integer.parseInt(numbers[i]);
            i++;
        } while(numbers.length != i);
        for(int j = 0; j < numbers.length; j++){
            if(maxx < Integer.parseInt(numbers[j])){
                maxx = Integer.parseInt(numbers[j]);
            }
            if (Integer.parseInt(numbers[j]) < minn){
                minn = Integer.parseInt(numbers[j]);
            }
        }

        System.out.println(sum);
        System.out.println(maxx);
        System.out.println(minn);
    }
}

public class massiv{ //5
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

public class massiv{//6
    public static void main(String[] args){
        int num = 10;
        double otvet = 0.0;
        while (num > 0) {
            otvet = otvet + (double)1 / num;
            num--;
            System.out.printf("%f, ", otvet);
        }
    }
}
*/
public class massiv{ //7
    public static int get_factorial(int f){
        int factorial_result = 1;
        for (int i = 1; i <= f; i++) {
            factorial_result *= i;
        }
        return factorial_result;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(get_factorial(i));
    }
}

