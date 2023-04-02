package PlayGround;

import java.util.ArrayList;
import java.util.List;

public class ForEachListLambda {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(10);
        testList.add(29);
        testList.forEach(number -> System.out.println("hello"));
    }
}
