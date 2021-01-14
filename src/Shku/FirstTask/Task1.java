package Shku.FirstTask;

import javax.swing.*;

public class Task1 {


    public static void main(String[] args) {


        String Number;
        String Messege = "Заданное число соответсвует дню недели - ";
        int Day;
        String Day1 = "понедельник";
        String Day2 = "вторник";
        String Day3 = "среда";
        String Day4 = "четверг";
        String Day5 = "пятница";
        String Day6 = "суббота";
        String Day7 = "воскресенье";

        do {
            Number = JOptionPane.showInputDialog("Введите число от 1 до 7");
            if (!Number.matches("[0-9]+")) continue;
            Day = Integer.parseInt(Number);

            switch (Day) {
                case 1:
                    JOptionPane.showMessageDialog(null, Messege + Day1);
                    System.exit(0);
                case 2:
                    JOptionPane.showMessageDialog(null, Messege + Day2);
                    System.exit(0);
                case 3:
                    JOptionPane.showMessageDialog(null, Messege + Day3);
                    System.exit(0);
                case 4:
                    JOptionPane.showMessageDialog(null, Messege + Day4);
                    System.exit(0);
                case 5:
                    JOptionPane.showMessageDialog(null, Messege + Day5);
                    System.exit(0);
                case 6:
                    JOptionPane.showMessageDialog(null, Messege + Day6);
                    System.exit(0);
                case 7:
                    JOptionPane.showMessageDialog(null, Messege + Day7);
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Заданное число не соответсвует ни одному дню недели!");
                    System.exit(0);
            }
        } while (true);

    }
}