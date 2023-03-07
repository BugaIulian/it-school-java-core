package CodeWarsExercises;

import java.util.Scanner;

public class AbbreviateTwoWordName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        String upperC1 = "";
        for (int i = 0; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                upperC1 += (String.valueOf(name.charAt(i)) + ".");
            }
        }
        upperC1 = upperC1.substring(0, upperC1.length() - 1);
        System.out.println(upperC1);
    }
}

