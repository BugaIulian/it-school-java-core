package CodeWarsExercices;

//https://www.codewars.com/kata/57f609022f4d534f05000024/train/java

public class FindTheStrayNumberNOTSOLVED {
    public static void main(String[] args) {
        int[] arrayTest = new int[]{17, 17, 17, 17, 7, 17, 17};
        // 0   1  2   3   4   5   6
        int strayNumber0 = 0;
        int strayNumber1 = 0;

        //Check the firs int index

        if (arrayTest[0] != arrayTest[1]) {
            strayNumber0 = arrayTest[0];
        }
        //Check the last index
        for (int i = 1; i < arrayTest.length - 1; i++) {

            if (arrayTest[i] != arrayTest[i + 1]) {
                strayNumber1 = arrayTest[i + 1];

            }
        }
        System.out.println(strayNumber1);
    }
}
