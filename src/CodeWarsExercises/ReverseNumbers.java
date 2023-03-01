package CodeWarsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int newInt = scanner.nextInt();
        int[] array = new int[newInt];

        for (int i = 0; i < newInt; i++) {
            array[i] = newInt - i;
        }

        System.out.println(Arrays.toString(array));


    }
}
