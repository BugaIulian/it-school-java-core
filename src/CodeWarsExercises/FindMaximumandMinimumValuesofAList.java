package CodeWarsExercises;

import java.util.Arrays;

public class FindMaximumandMinimumValuesofAList {

    public static void main(String[] args) {
        int[] list ={1,8,3,4,5};

        System.out.println(Arrays.toString(list));
        int minimumValue = Integer.MIN_VALUE;
        int maximumValue = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > minimumValue) {
                minimumValue = list[i];
            } else if (list[i] < maximumValue) {
                maximumValue = list[i];
            }
        }
        System.out.println(minimumValue + " " + maximumValue);
    }
}

//import java.util.Arrays;
//
//public class Kata {
//
//  public int min(int[] list) {
//    return Arrays.stream(list).min().getAsInt();
//  }
//
//  public int max(int[] list) {
//    return Arrays.stream(list).max().getAsInt();
//  }
//}
