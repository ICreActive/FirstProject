package Shku.ThirdTask;

public class Task4 {

    public static void main(String[] args) {

        String str = "I become so numb I can't feel you there Become so tired So much more aware";


        String[] words = str.split(" ");
        for (String word : words) {

            int count = 0;
            for (String s : words) {
                if (s.equalsIgnoreCase(word)) {
                    count++;
                }
            }
            System.out.println(word + " -  " + count);
        }
    }
}










