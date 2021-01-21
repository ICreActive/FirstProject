package Shku.SecondTask;

import javax.swing.*;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        String UserChoice;

        UserChoice = JOptionPane.showInputDialog(
                null,
                "Введите любое число от 0 до 100",
                "Угадайка",
                JOptionPane.INFORMATION_MESSAGE);

        int Choice = Integer.parseInt(UserChoice);

        int Counter = 0;
        int yourNumber;

        do {
            Random random = new Random();
            yourNumber = random.nextInt(101);
            Counter++;

        }
        while (yourNumber != Choice);

        System.out.println("Вы загадали цифру: " + yourNumber);
        System.out.println("Количество попыток: " + Counter);


    }
}




