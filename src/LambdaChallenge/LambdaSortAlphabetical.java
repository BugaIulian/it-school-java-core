package LambdaChallenge;

import java.util.Arrays;
import java.util.List;

public class LambdaSortAlphabetical {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("banana", "apple", "orange");
        stringList.sort(String::compareTo);
        System.out.println(stringList);
    }
}
