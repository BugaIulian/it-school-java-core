package CodeWarsExercises;

//https://www.codewars.com/kata/52aeb2f3ad0e952f560005d3/train/java
public class SortTheGiftCode {
    public static void main(String[] args) {
        sortGiftCode("acbid");
    }

    private static String sortGiftCode(String code) {
        String sortedString = code.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return sortedString;
    }
}
