package CodeWarsExercises;

import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int inputNumber = scanner.nextInt();
        String strNumber = Integer.toString(inputNumber);
        System.out.println(strNumber);
    }
}
