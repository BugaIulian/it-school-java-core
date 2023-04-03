package LambdaChallenge;

import java.util.Arrays;
import java.util.List;

public class LambdaEvenNumbers {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenNumbers = intList.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumbers);
    }
}
