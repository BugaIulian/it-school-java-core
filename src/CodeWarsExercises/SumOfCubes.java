package CodeWarsExercises;

//https://www.codewars.com/kata/59a8570b570190d313000037/train/java
public class SumOfCubes {

    public static void main(String[] args) {
        sumCubes(123);
    }

    private static long sumCubes(long n) {
        long sumOfCubes = 0;
        for (long i = 1; i <= n; i++) {
            sumOfCubes = (long) (sumOfCubes + (Math.pow(i, 3)));
        }
        return sumOfCubes;
    }
}
