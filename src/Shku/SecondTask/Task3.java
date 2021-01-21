package Shku.SecondTask;

import javax.swing.*;

public class Task3 {


    public static void main(String[] args) {

    int a = 5;
    int c = 0;
    int Choice;
    String UserChoice;

    while (c < 3) {
        UserChoice = JOptionPane.showInputDialog(null,
                "Какое число от 1 до 10 мое любимое? У тебя 3 попытки",
                "Угадаешь?", JOptionPane.INFORMATION_MESSAGE);
        if (UserChoice == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Слабак",
                    "Оценка",
                    JOptionPane.INFORMATION_MESSAGE);
            return;

        } else {
            Choice = Integer.parseInt(UserChoice);

            if (Choice != a) {
                System.out.println("Не угадал");

            } else {
                System.out.println("Верно");
                return;
            }
            c++;

        }

    }
}
}
