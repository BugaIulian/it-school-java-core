package CodeWarsExercises;

import java.util.ArrayList;
import java.util.List;

//https://www.codewars.com/kata/5aff237c578a14752d0035ae/train/java
public class PredictYourAge {
    public static void main(String[] args) {

        predictAge(65, 60, 75, 55, 60, 63, 64, 45);
        //86
    }

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        // your code goes here
        int result = 0;
        List<Integer> ages = new ArrayList<>();
        ages.add(age1);
        ages.add(age2);
        ages.add(age3);
        ages.add(age4);
        ages.add(age5);
        ages.add(age6);
        ages.add(age7);
        ages.add(age8);
        int multiple = 0;
        int squareRoot;
        int sum = 0;
        for (int i = 0; i < ages.size(); i++) {
            multiple = ages.get(i);
            squareRoot = multiple * multiple;
            ages.set(i, squareRoot);
            sum += ages.get(i);
        }
        result = (int) Math.sqrt(sum);
        return result / 2;
    }
}
