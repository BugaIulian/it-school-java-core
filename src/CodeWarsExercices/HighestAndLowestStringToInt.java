package CodeWarsExercices;

public class HighestAndLowestStringToInt {
    public static void main(String[] args) {
        String highAndLowTest = "1 2 3 4 5";
        String[] strArray = highAndLowTest.split(" ");
        int size = strArray.length;
        int[] arrayInt = new int[size];

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            arrayInt[i] = Integer.parseInt(strArray[i]);
        }

        for (int i = 0; i < size; i++) {
            if (arrayInt[i] > maxValue) {
                maxValue = arrayInt[i];

            }
        }

        for (int i = 0; i < size; i++) {
            if (arrayInt[i] < minValue) {
                minValue = arrayInt[i];
            }
        }


        System.out.println(maxValue + " " + minValue);


    }
}
