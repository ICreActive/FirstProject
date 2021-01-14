package Shku.FirstTask;

import com.sun.source.tree.IfTree;

import javax.swing.*;

public class Task2 {
    public static void main(String[] args) {

        double Number1;
        double Number2;
        double Choice;
        String UserChoice;

        do {

            UserChoice = JOptionPane.showInputDialog("Введите любое число");
            if (!UserChoice.matches("[0-9]+")) continue;
            Choice = Double.parseDouble(UserChoice);
            Number1 = 1;
            Number2 = 100;
            if (Choice < Number1) {
                System.out.println("Ваше число относится к первому диапазону");
            } else if (Choice > Number1 && Choice < Number2) {
                System.out.println("Ваше число относится ко второму диапазону");
            }
            else if (Choice > Number2) {
                System.out.println("Ваше число относится к третьему диапазону");
            }
            else  {
                System.out.println("Число находится на границе диапозонов");
            }
        } while (true);

    }
}