package Shku.FirstTask;

public class Task2 {
    public static void main(String[] args) {

        int Chislo1;
        int Chislo2;
        int VvediteChislo;
        VvediteChislo = 1980;
        Chislo1 = 3;
        Chislo2 = 9;
        if (VvediteChislo<Chislo1){
            System.out.println("Ваше число относится к первому диапазону");
        }
        if (VvediteChislo>Chislo1 && VvediteChislo<Chislo2){
            System.out.println("Ваше число относится ко второму диапазону");
        }
        if (VvediteChislo>Chislo2){
            System.out.println("Ваше число относится к третьему диапазону");
        }
    }
}