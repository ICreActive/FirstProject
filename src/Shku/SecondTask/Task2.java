package Shku.SecondTask;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        // Add Array for days

        int[] days = new int[31];
        days[0] = 0;
        for (int i = 1; i < days.length; i++) {
            days[i] = days[i - 1] + 1;
        }

        //Add Array for Month

        int[] Month = new int[13];
        Month[0] = 0;
        for (int j = 1; j < Month.length; j++) {
            Month[j] = Month[j - 1] + 1;
        }

        int inputMonth;
        System.out.println("Введите номер месяца");
        Scanner sc = new Scanner(System.in);
        inputMonth = sc.nextInt();

        for (int j = 0; j < Month.length; j++) {
            if (inputMonth == Month[j]) {
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

            } else {
                Month[j]++;
            }
        }
        System.out.println("Не существует такого месяца");


    }

}

