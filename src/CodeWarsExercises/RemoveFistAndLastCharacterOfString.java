package CodeWarsExercises;

import java.util.Scanner;

public class RemoveFistAndLastCharacterOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        String exitString = inputString.substring(1,inputString.length()-1);
        System.out.println(exitString);
    }
}
