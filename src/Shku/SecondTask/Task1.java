package Shku.SecondTask;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число задающее размеры пирамиды");
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int x = 0; x <= n / 2; x++) {
            for (int i = x; i < n - x; i++) {
                for (int j = x; j < n - x; j++) {
                    array[i][j] = array[i][j] + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

    }

}

