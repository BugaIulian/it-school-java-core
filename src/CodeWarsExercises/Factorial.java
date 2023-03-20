package CodeWarsExercises;
//https://www.codewars.com/kata/57a049e253ba33ac5e000212/train/java
public class Factorial {
    public static void main(String[] args) {
        System.out.println(writeFactorial(20));
    }

    private static long writeFactorial(int i) {
        long factorial = 1;
        while (i > 0) {
            factorial = factorial*i;
            i--;
        }

        return factorial;
    }
}
