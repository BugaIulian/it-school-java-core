package CodeWarsExercices;

import java.util.Scanner;

public class ConvertAStringToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.next();

        int outputInt = Integer.parseInt(inputString);

        System.out.println(outputInt);
    }
}
