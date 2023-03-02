package CodeWarsExercises;

//https://www.codewars.com/kata/56b1f01c247c01db92000076/train/java
public class DoubleChar {
    public static void main(String[] args) {

        Solution newObject = new Solution();
        String testString = newObject.doubleChar("Test String Here");

    }

    public static class Solution {


        public String doubleChar(String s) {
            //enter your code here

            char[] stringToChars = s.toCharArray();
            StringBuilder repeatedChar = new StringBuilder();

            for (char x : stringToChars) {
                repeatedChar.append(x).append(x);

            }

            return repeatedChar.toString();
        }
    }
}
