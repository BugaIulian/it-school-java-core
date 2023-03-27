package CodeWarsExercises;

/* https://www.codewars.com/kata/567bf4f7ee34510f69000032/train/java */
public class IsItADigit {


    public static void main(String[] args) {
        isDigit("5");
        System.out.println(isDigit(" "));
    }

    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
