package Shku.FirstTask;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int a = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите 1-е число");
        if (sc1.hasNextInt()) {
            a = sc1.nextInt();
        } else {
            System.out.println("Вы ввели неверные данные, до свидания!");
            return;
        }

        int b = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите 2-е число");

        if (sc2.hasNextInt()) {
            b = sc2.nextInt();
        } else {
            System.out.println("Вы ввели неверные данные, до свидания!");
            return;
        }

        int c = 0;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите 3-е число");
        if (sc3.hasNext()) {
            c = sc3.nextInt();
        } else {
            System.out.println("Вы ввели неверные данные, до свидания!");
            return;
        }

        if (a > b && a > c) {
            System.out.println("Максимальное число из преставленных - " + a);
        }
        if (b > a && b > c) {
            System.out.println("Максимальное число из преставленных - " + b);
        }
        if (c > a && c > b) {
            System.out.println("Максимальное число из преставленных - " + c);
        }

        if (a < b && a < c) {
            System.out.println("Наименьшее число из преставленных - " + a);
        }
        if (b < a && b < c) {
            System.out.println("Наименьшее число из преставленных - " + b);
        }
        if (c < a && c < b) {
            System.out.println("Наименьшее число из преставленных - " + c);
        }

        System.out.println("Среднее арифметическое - " + (float) (a + b + c) / 3);
    }
}
