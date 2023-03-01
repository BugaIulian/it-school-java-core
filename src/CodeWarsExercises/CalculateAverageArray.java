package CodeWarsExercises;

public class CalculateAverageArray {
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 2, 3};
        int sum = 0;
        int average = 0;

        for (int i = 0; i < testArray.length; i++) {
            sum = sum + testArray[i];
        }

        average = sum / testArray.length;
        System.out.println(average);
    }
}
