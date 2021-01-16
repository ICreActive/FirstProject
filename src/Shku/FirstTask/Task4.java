package Shku.FirstTask;

import java.util.Scanner;

public class Task4 {
    private static final int c = 10;

    public static void main(String[] args) {

        float a;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите 1-е число (любое кроме 0)");
        if (sc1.hasNextFloat()) {
            a = sc1.nextFloat();
            if (a == 0) {
                System.out.println("Для данного числа задача невыполнима");
                return;
            }
        } else {
            System.out.println("Вы ввели некорректные данные");
            return;
        }

        float b;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите 2-е число");
        if (sc2.hasNextFloat()) {
            b = sc2.nextFloat();
            sc1.close();
            sc2.close();

        } else {
            System.out.println("Вы ввели некорректные данные");
            return;
        }

        float lowValue = (a - a * c / 100); // low value
        float highValue = (a + a * c / 100); // High value

        System.out.println("Диапозон близких значений от " + lowValue + " до " + highValue);

        if (b <= highValue && b >= lowValue) {
            System.out.println("Значения близки");
        } else {

            System.out.println("Значения не близки");
        }
    }
}


