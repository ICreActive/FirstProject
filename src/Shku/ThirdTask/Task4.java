package Shku.ThirdTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    public static void main(String[] args) {

        String str = "I become so numb I can't feel you there Become so tired So much more aware";

        String[] words = str.split(" ");
        for (String word : words) {

            word = word.toLowerCase();
            str = str.toLowerCase();
            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(str);
            int count = 0;
            while (matcher.find()) {
                count++;

            }
            System.out.println(word + "  - " + count);
        }

    }
}







