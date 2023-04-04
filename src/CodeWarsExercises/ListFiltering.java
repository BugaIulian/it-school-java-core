package CodeWarsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java
public class ListFiltering {

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>(Arrays.asList(1, "a", 2, "s"));
        filterList(objectList);
    }

    private static List<Object> filterList(List<Object> objectList) {
        return objectList.stream()
                .filter(obj -> obj instanceof Integer)
                .collect(Collectors.toList());
    }
}
