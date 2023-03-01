package CodeWarsExercises;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String answer = even_or_odd(scanner.nextInt());

        System.out.println(answer);


    }

    public static String even_or_odd(int number) {

        String evenOrOdd = "";

        if (number % 2 == 0) {
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd";
        }


        return evenOrOdd;
    }

}

