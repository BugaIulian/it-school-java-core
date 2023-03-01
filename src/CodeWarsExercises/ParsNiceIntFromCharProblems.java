package CodeWarsExercises;

import java.util.Scanner;

public class ParsNiceIntFromCharProblems {
    //    You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.
//
//Write a program that returns the girl's age (0-9) as an integer.
//
//Assume the test input string is always a valid string.
// For example, the test input may be "1 year old" or "5 years old". The first character in the string is always a number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        String girlsAnswer = scanner.nextLine();
        String getInteger = girlsAnswer.substring(0, 1);
        int stringToInteger = Integer.parseInt(getInteger);

        System.out.println(stringToInteger);
    }
}

// public class CharProblem {
//  public static int howOld(final String herOld) {
//
//  return Character.getNumericValue(herOld.charAt(0));
//  }
//}