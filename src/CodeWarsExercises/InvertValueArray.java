package CodeWarsExercises;
//https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java
import java.util.Arrays;

public class InvertValueArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(invertVal(new int[]{-1, 2})));
    }

    private static int[] invertVal(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ints[i] * -1;
        }
        return ints;
    }
}
