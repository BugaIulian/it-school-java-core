package CodeWarsExercises;

import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();

        Scanner scanner = new Scanner(System.in);



        name = new StringBuilder(scanner.next());

        name.reverse();

        System.out.println(name);


    }
}
