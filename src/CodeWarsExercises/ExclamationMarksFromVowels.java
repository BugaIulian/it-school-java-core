package CodeWarsExercises;

//https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed/train/java
public class ExclamationMarksFromVowels {
    public static void main(String[] args) {
        System.out.println(replace("Replace all the vowels with exclamation marks"));
    }

    public static String replace(final String s) {

        StringBuilder somethingUseful = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
                    c = '!';
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + c);
            }
            somethingUseful.append(c);

        }

        return somethingUseful.toString();
    }
}

//public class Solution {
//    public static String replace(final String s) {
//        return s.replaceAll("[aeiouAEIOU]", "!");
//    }
//}
