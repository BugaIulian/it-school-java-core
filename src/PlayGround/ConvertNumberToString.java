package PlayGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertNumberToString {
    public static void main(String[] args) {

        int testInt = 258421;

        String intToString = Integer.toString(testInt);
        int[] exitArray = new int[intToString.length()];


        for (int i = intToString.length() - 1; i >= 0; i--) {
            char c = intToString.charAt(i);

        }

        System.out.println(Arrays.toString(exitArray));
    }
}

//public class Kata {
//  public static int[] digitize(long n) {
//        return new StringBuilder().append(n)
//                                  .reverse()
//                                  .chars()
//                                  .map(Character::getNumericValue)
//                                  .toArray();
//  }
//}
