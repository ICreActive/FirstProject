package Shku.FirstTask;

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        float b = 0;
        int c = 10;
        float d;

        if (a > b && b!=0) {

            d = (a / b * 100) - 100;
            System.out.println(d + "%");
            if (d > c) {
                System.out.println("Значения не близки");
            } else
                System.out.println("Значения близки");
        }
        else {
            d = (byte) ((b / a * 100) - 100);
            System.out.println(d + "%");
            if (d > c) {
                System.out.println("Значения не близки");
            } else
                System.out.println("Значения близки");
        }
    }

}
