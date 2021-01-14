package Shku.FirstTask;

public class Task3 {
    public static void main(String[] args) {
        int a=100;
        int b=50;
        int c=20;

        if (a>b&&a>c) {
            System.out.println("Максимальное число из преставленных - " + a);}
        if (b>a&&b>c) {
            System.out.println("Максимальное число из преставленных - " + b);}
        if (c>a&&b>b) {
            System.out.println("Максимальное число из преставленных - " + c);}

        if (a<b&&a<c) {
            System.out.println("Наименьшее число из преставленных - " + a);}
        if (b<a&&b<c) {
            System.out.println("Наименьшее число из преставленных - " + b);}
        if (c<a&&c<b) {
            System.out.println("Наименьшее число из преставленных - " + c);}

        System.out.println("Среднее арифметическое - " + (float)(a+b+c)/3);
    }
}
