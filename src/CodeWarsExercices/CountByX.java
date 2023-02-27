package CodeWarsExercices;

import java.util.Arrays;

//https://www.codewars.com/kata/5513795bd3fafb56c200049e/train/java
public class CountByX {
    public static void main(String[] args) {

        int x = 1;
        int y = 10;

        int[] arrayCount = new int[y];

        for (int i = 0; i < y ; i++) {

            arrayCount[i] = x * (i + 1);

            System.out.println(i);

        }

        System.out.println(Arrays.toString(arrayCount));
    }
}
