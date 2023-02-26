package CodeForces849.checkChar;

import java.util.ArrayList;
import java.util.Scanner;

public class Boolean {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberCases = scanner.nextInt();
        String newString;
        ArrayList<String> memoryIn = new ArrayList<>();


        for (int i = 0; i < numberCases; i++) {
            newString = scanner.next();
            memoryIn.add(newString);

        }

        for (String givenLetter : memoryIn) {
            switch (givenLetter) {
                case "c", "e", "o", "d", "f", "r" -> printYes();
                default -> System.out.println("NO");
            }

        }


    }
    static void printYes() {
        System.out.println("YES");
    }
}
