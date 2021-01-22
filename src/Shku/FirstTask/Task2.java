package Shku.FirstTask;

import javax.swing.*;

public class Task2 {
    public static void main(String[] args) {

        double number1;
        double number2;
        double choice;
        String userChoice;

        do {

            userChoice = JOptionPane.showInputDialog("Введите любое число");
            if (userChoice == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Слабак",
                        "Оценка",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                if (!userChoice.matches("[0-9]+")) continue;
                choice = Double.parseDouble(userChoice);

                number1 = 1;
                number2 = 100;
                if (choice < number1) {
                    System.out.println("Ваше число относится к первому диапазону");
                } else if (choice > number1 && choice < number2) {
                    System.out.println("Ваше число относится ко второму диапазону");
                } else if (choice > number2) {
                    System.out.println("Ваше число относится к третьему диапазону");
                } else {
                    System.out.println("Число находится на границе диапозонов");
                }
            }

        } while (true);

    }
}