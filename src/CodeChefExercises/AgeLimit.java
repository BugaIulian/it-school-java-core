package CodeChefExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgeLimit {
    public static void main(String[] args) {
        int X = 0; //minimum age limit
        int Y = 0; // age should be strictly less than your Y
        int age = 0;


        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        List<String> responses = new ArrayList<String>();


        for (int i = 0; i < testCases; i++) {
            X = scanner.nextInt();
            Y = scanner.nextInt();
            age = scanner.nextInt();


            if (age >= X && age < Y) {
                responses.add("YES");
            } else {
                responses.add("NO");
            }
        }
        for (String answer : responses) {
            System.out.println(answer);
        }

    }


}

