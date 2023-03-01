package PlayGround;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String someString = "Here is some string for you";
        //Split();
        String[] splitString = someString.split("\\s");
        int countString = splitString.length;
        System.out.println(Arrays.toString(splitString));
        System.out.println(countString);




    }
}
