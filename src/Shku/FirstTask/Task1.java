package Shku.FirstTask;

import javax.swing.*;

public class Task1 {


    public static void main(String[] args) {


        String number;
        String messege = "Заданное число соответсвует дню недели - ";
        int day;
        String day1 = "понедельник";
        String day2 = "вторник";
        String day3 = "среда";
        String day4 = "четверг";
        String day5 = "пятница";
        String day6 = "суббота";
        String day7 = "воскресенье";

        do {
            number = JOptionPane.showInputDialog("Введите число от 1 до 7");
            if (!number.matches("[0-9]+")) continue;
            day = Integer.parseInt(number);

            switch (day) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null, messege + day1);
                    System.exit(0);
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, messege + day2);
                    System.exit(0);
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, messege + day3);
                    System.exit(0);
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, messege + day4);
                    System.exit(0);
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(null, messege + day5);
                    System.exit(0);
                }
                case 6 -> {
                    JOptionPane.showMessageDialog(null, messege + day6);
                    System.exit(0);
                }
                case 7 -> {
                    JOptionPane.showMessageDialog(null, messege + day7);
                    System.exit(0);
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Заданное число не соответсвует ни одному дню недели!");
                    System.exit(0);
                }
            }
        } while (true);

    }
}