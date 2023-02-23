package CodeWarsProblems;

public class ConvertBooleantoStrings {
    public static void main(String[] args) {

        String animal = "Cat";
        System.out.println(animal.substring(1,2));

    }
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}
