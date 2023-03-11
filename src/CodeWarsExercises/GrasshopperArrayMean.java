package CodeWarsExercises;

//https://www.codewars.com/kata/55d277882e139d0b6000005d/train/java
public class GrasshopperArrayMean {
    public static void main(String[] args) {
        findAverage(new int[]{1, 3, 5, 7});
    }

    private static int findAverage(int[] nums) {
        int sum = 0;
        for (int number : nums) {
            sum = sum + number;
        }
        return sum / nums.length;
    }
}
