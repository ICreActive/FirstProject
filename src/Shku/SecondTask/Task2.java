package Shku.SecondTask;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int inputMonth;
        System.out.println("Введите номер месяца");
        Scanner sc = new Scanner(System.in);
        inputMonth = sc.nextInt();
        int a;

        if (inputMonth == 1 ||
                inputMonth == 3 ||
                inputMonth == 5 ||
                inputMonth == 7 ||
                inputMonth == 8 ||
                inputMonth == 10 ||
                inputMonth == 12) {

            a = 31;
        } else if (inputMonth == 2) {
            a = 28;
        } else {
            a = 30;
        }

        // Add Array for days

        int[] days = new int[a];
        days[0] = 1;
        for (int i = 1; i < days.length; i++) {
            days[i] = days[i - 1] + 1;
        }

        //Add Array for month

        int[] month = new int[13];
        month[0] = 0;
        for (int j = 1; j < month.length; j++) {
            month[j] = month[j - 1] + 1;
        }


        for (int j = 0; j < month.length; j++) {
            if (inputMonth == month[j]) {
                int inputDay;
                System.out.println("Введите номер дня в месяце");
                Scanner sc1 = new Scanner(System.in);
                inputDay = sc1.nextInt();
                sc.close();
                sc1.close();

                for (int i = 0; i < days.length; i++) {
                    if (inputDay == days[i]) {
                        System.out.println("число " + inputDay + " есть в " + inputMonth + "м месяце");
                        return;
                    } else {
                        days[i]++;
                    }
                }
                System.out.println("Данного числа нет в этом месяце");
                return;

            } else {
                month[j]++;
            }
        }
        System.out.println("Не существует такого месяца");

    }

}

