package CodeWarsExercises;

import java.util.Arrays;

// https://www.codewars.com/kata/559590633066759614000063/train/java

public class TheHighestProfitWins {
    public static void main(String[] args) {

        int[] arrayNumbers = new int[] {1, 2, 8, 4, 5};

        Arrays.sort(arrayNumbers);

        int[] newArrayMinMax = new int[2];

        newArrayMinMax[0] = arrayNumbers[0];
        newArrayMinMax[1] = arrayNumbers[arrayNumbers.length - 1];

        System.out.println(Arrays.toString(newArrayMinMax));





//        int max = Math.max(arrayNumbers[0], arrayNumbers[arrayNumbers.length - 1]);
//        int min = Math.min(arrayNumbers[0], arrayNumbers[arrayNumbers.length - 1]);
//        System.out.println(max);
//        System.out.println(min);

    }
}

//import java.util.Arrays;
//
//class MinMax {
//    public static int[] minMax(int[] arr) {
//        // Your awesome code here
//         Arrays.sort(arr);
//        return new int[]{arr[0],arr[arr.length-1]};
//    }
//}
