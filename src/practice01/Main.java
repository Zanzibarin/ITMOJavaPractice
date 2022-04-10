package practice01;

import java.io.BufferedReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //--Практика 1, задача 1--------------------------------------------------------------//
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        //--Практика 1, задача 2--------------------------------------------------------------//
        int a = 46;
        int b = 10;
        int c = 10;
        float d = 3f;
        float rezOne = (a + b) * (c / d);
        System.out.println("");
        System.out.println(rezOne);

        int e = 29;
        int f = 4;
        int g = -15;
        int rezTwo = e * f * g;
        System.out.println(rezTwo);

        //--Практика 1, задача 3--------------------------------------------------------------//
        int number = 10500;
        double result = (number * 1.0 / 10) / 10;
        System.out.println("");
        System.out.println(result);

        //--Практика 1, задача 4--------------------------------------------------------------//
        float h = 3.6f;
        float i = 4.1f;
        float j = 5.9f;
        float resultTwo = h * i * j;
        System.out.println("");
        System.out.println(resultTwo);

        //--Практика 1, задача 5, задача 6----------------------------------------------------//
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.nextInt());

            int b_new = scanner.nextInt();
            if (b_new % 2 == 0){
                System.out.println("Чётное");
            }
            if (b_new % 2 != 0){
                System.out.println("Нечётное");
            }
            if (b_new % 2 == 0 && b_new > 100){
                System.out.println("Выход за пределы диапазона");
            }
        }
    }
}
