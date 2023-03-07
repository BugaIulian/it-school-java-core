package CodeWarsExercises;

import java.util.Scanner;

public class VowelCount {
    public static int MAX_INPUT_STRING_VALUE;
    public static int NUMBER_OF_VOWELS;
    public static char STRING_CHARACTERS;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        for (MAX_INPUT_STRING_VALUE = 0; MAX_INPUT_STRING_VALUE < inputString.length(); MAX_INPUT_STRING_VALUE++) {
             STRING_CHARACTERS = inputString.charAt(MAX_INPUT_STRING_VALUE);
            switch (STRING_CHARACTERS) {
                case 'a', 'e', 'i', 'o', 'u' -> NUMBER_OF_VOWELS += 1;
            }
        }
        System.out.println(NUMBER_OF_VOWELS);
    }

//     return str.replaceAll("(?i)[^aeiou]", "").length();
//    The regular expression (?i)[^aeiou] is used to match
//    any character that is not a vowel. The (?i) part makes the matching case-insensitive.
}
