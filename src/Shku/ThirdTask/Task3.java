package Shku.ThirdTask;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        System.out.print("Enter your name:");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.print("How old are you:");
        Scanner scanner1 = new Scanner(System.in);
        String userOld = scanner1.nextLine();
        scanner.close();

        userName = String.format("Hello %s!%n%1$s, how are you?%n", userName);

        System.out.print(userName);

    }
}