package CodeWarsExercices;

public class FindMaximumandMinimumValuesofAList {

    public static void main(String[] args) {
        int[] list = {4, 6, 2, 1, 9, 63, -134, 566};
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
