package CodeWarsExercises;

import static java.lang.Math.abs;

public class ReturnNegative {
    public static void main(String[] args) {

        System.out.println(makeNegative(9));


    }

    public static int makeNegative(final int x) {


        return -abs(x);
    }
}
