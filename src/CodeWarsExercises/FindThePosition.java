package CodeWarsExercises;
//https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java

public class FindThePosition {
    public static void main(String[] args) {
        findPosition("c");
        System.out.println(findPosition("d"));
    }

    private static String findPosition(String c) {
        char x = c.charAt(0);
        char y = Character.toLowerCase(x);
        int asciiValueOfChar = (int) y;
        int alphabetPosition = asciiValueOfChar - 96;
        return "Position of alphabet: " + alphabetPosition;
    }
}
