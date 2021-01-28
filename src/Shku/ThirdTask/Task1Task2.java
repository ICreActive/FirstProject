package Shku.ThirdTask;

import java.util.Arrays;
import java.util.Random;

public class Task1Task2 {

    public static void main(String[] args) {

        // method String
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            Random rd = new Random();
            int rdNumber = rd.nextInt(1000);
            array[i] = rdNumber;

        }

        String str = Arrays.toString(array);
        str = str.replaceAll("^\\[|\\]$|, ", " ");
        System.out.print("method String: " + str);
        System.out.println();

        // method StringBuilder
        int[] array1 = new int[100];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array1.length; i++) {
            Random rd1 = new Random();
            int rdNumber1 = rd1.nextInt(1000);
            sb.append(rdNumber1).append(" ");
        }
        System.out.println("method StringBuilder: " + sb);

        // Task2
        String string = sb.toString();
        String task2 = string.replaceAll("^\\d{2} | \\d{2} | \\d{2}$", " -1 ");
        System.out.println("Replaced: " + task2);

    }

}
