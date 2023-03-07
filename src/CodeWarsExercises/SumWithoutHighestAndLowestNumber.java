package CodeWarsExercises;

//https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {
    public static void main(String[] args) {
        int[] numberArraysTest = new int[]{6, 2, 1, 8, 10};
        Arrays.sort(numberArraysTest);
        int sum = 0;
        for (int i = 1; i < numberArraysTest.length - 1; i++) {
            sum += numberArraysTest[i];
        }
        System.out.println(sum);
    }
}
