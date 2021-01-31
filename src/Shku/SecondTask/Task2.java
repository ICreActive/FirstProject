package Shku.SecondTask;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int inputMonth;
        System.out.println("Введите номер месяца");
        Scanner sc = new Scanner(System.in);
        inputMonth = sc.nextInt();
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (inputMonth <= months.length && inputMonth > 0) {
            for (int j = 0; j < months.length; j++) {
                if (j == inputMonth - 1) {
                    int inputDay;
                    System.out.println("Введите номер дня в месяце");
                    Scanner sc1 = new Scanner(System.in);
                    inputDay = sc1.nextInt();
                    if (inputDay <= months[j] && inputDay > 0) {
                        System.out.println("число " + inputDay + " есть в " + inputMonth + "м месяце");
                        return;
                    } else {
                        System.out.println("Данного числа нет в этом месяце");
                    }
                }
            }
        } else {
            System.out.println("Нет такого месяца");
        }
    }
}
