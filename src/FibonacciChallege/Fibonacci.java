package FibonacciChallege;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number from Fibonacci Sequence:");
        int number = scanner.nextInt();
        while (!checkFibonacci(number)) {
            System.out.println("Please provide a valid number from Fibonacci Sequence:");
            number = scanner.nextInt();
        }
        int indexOfNumberFibonacci = (int) indexOfProvidedFibonacciNumber(number);
        for (long fibonacciNumber : benetFormula(indexOfNumberFibonacci)) {
            System.out.println(fibonacciNumber);
        }
    }

    private static List<Long> benetFormula(int indexOfNumberFibonacci) {
        // Benet's Formula to calculate the next Fibonacci Number F(n+1) = (φ^(n+1) - (1-φ)^(n+1)) / √5 where Fn is the provided Fibonacci number and the index being n.
        List<Long> fibonacciNumbers = new ArrayList<>();
        double divineProportion = (1 + Math.sqrt(5)) / 2;
        for (int i = 1; i <= 100; i++) {
            fibonacciNumbers.add((long) ((Math.pow(divineProportion, indexOfNumberFibonacci + 1 + i) - Math.pow(1 - divineProportion, indexOfNumberFibonacci + 1 + i)) / Math.sqrt(5)));
        }
        return fibonacciNumbers;
    }

    public static boolean checkFibonacci(int n) {
        // Formula to check if a given number is a Fibonacci number > (5*N(to the power of 2) + 4) or (5*N(to the power of 2) -4) is a perfect square.
        double check1 = 5 * Math.pow(n, 2) + 4;
        double check2 = 5 * Math.pow(n, 2) - 4;
        double sqr1 = Math.sqrt(check1);
        double sqr2 = Math.sqrt(check2);
        return sqr1 - Math.floor(sqr1) == 0 || sqr2 - Math.floor(sqr2) == 0;
    }

    public static double indexOfProvidedFibonacciNumber(int n) {
        //Formula to find the index of a given Fibonacci number n = log((13 * √5) + 1/2) / log((1 + √5) / 2)
        double index = 0;
        if (n >= 3) {
            double sqr5 = Math.sqrt(5);
            index = Math.round(Math.log(n * sqr5 + 0.5)) / (Math.log((1 + sqr5) / 2));
        } else if (n == 2) {
            index = 3;
        } else {
            index = n;
        }
        return index;
    }
}
