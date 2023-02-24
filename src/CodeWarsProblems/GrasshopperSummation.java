package CodeWarsProblems;

import java.util.ArrayList;
import java.util.Scanner;

//rite a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
//
//For example (Input -> Output):
//
//2 -> 3 (1 + 2)
//8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)

public class GrasshopperSummation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        int sum = 0;
        int finalSum = 0;


        for (int i = 0; i < inputNumber; i++) {
            ++sum;

            finalSum += sum;
        }
        System.out.println(finalSum);
    }
}

//public class GrassHopper {
//
//    public static int summation(int n) {
//
//        return  n*(n+1)/2;
//    }
//}
