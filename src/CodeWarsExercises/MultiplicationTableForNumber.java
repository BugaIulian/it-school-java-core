package CodeWarsExercises;

import java.util.ArrayList;

public class MultiplicationTableForNumber {

    static int iteration = 0;
    static int sumMultiplication = 1;

    public static void main(String[] args) {
        //Test
        multiTable(5);
    }

    public static String multiTable(int num) {


        ArrayList<String> getStrings = new ArrayList<>();

        for (iteration = 1; iteration < 11; iteration++) {
            sumMultiplication = num * iteration;
            getStrings.add(iteration + " * " + num + " = " + sumMultiplication);

        }
        System.out.println(String.join("\n", getStrings));
        return String.join("\n", getStrings);
    }
}
