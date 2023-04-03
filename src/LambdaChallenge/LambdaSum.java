package LambdaChallenge;

import java.util.Arrays;
import java.util.List;

public class LambdaSum {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 6);
        int sum = numberList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
