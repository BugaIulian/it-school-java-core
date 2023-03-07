package CodeWarsExercises;

import java.util.Arrays;

//https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/java

public class ReturnArrayWithValueDoubled {
    public static void main(String[] args) {
        int[] testArray = new int[] {1, 2, 3};
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = testArray[i] * 2;
        }
        System.out.println(Arrays.toString(testArray));
    }
}
