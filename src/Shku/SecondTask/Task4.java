package Shku.SecondTask;

import javax.swing.*;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        String userChoice;

        userChoice = JOptionPane.showInputDialog(
                null,
                "Введите любое число от 0 до 100",
                "Угадайка",
                JOptionPane.INFORMATION_MESSAGE);
        if (userChoice == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Жаль",
                    "Ну ладно",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {

            int choice = Integer.parseInt(userChoice);

            int counter = 0;
            int yourNumber;

            do {
                Random random = new Random();
                yourNumber = random.nextInt(101);
                counter++;

            }
            while (yourNumber != choice);

            System.out.println("Вы загадали цифру: " + yourNumber);
            System.out.println("Количество попыток: " + counter);
        }


    }
}




