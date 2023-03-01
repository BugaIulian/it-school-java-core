package CodeWarsExercises;

import java.util.Scanner;

public class CapitalizeTheFirstLetterOfEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String capitalizedSentence = "";

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s");

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        capitalizedSentence = result.toString();

        final var substring = capitalizedSentence.substring(0, capitalizedSentence.length() - 1);


        System.out.print(substring);

    }
}
