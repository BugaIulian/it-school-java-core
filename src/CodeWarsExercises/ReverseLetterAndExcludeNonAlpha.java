package CodeWarsExercises;

//https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java
public class ReverseLetterAndExcludeNonAlpha {

    public static void main(String[] args) {

        System.out.println(reverseLetter("abt3!sam"));
    }

    private static String reverseLetter(String str) {
        String removedNonAlpha = str.replaceAll("[^a-zA-Z]", "");
        StringBuilder reversedStringBuilder = new StringBuilder();
        for (int i = removedNonAlpha.length() - 1; i >= 0; i--) {
            reversedStringBuilder.append(removedNonAlpha.charAt(i));
        }
        return String.valueOf(reversedStringBuilder);
    }
}
