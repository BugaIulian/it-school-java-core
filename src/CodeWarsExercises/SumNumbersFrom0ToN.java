package CodeWarsExercises;

//https://www.codewars.com/kata/56e9e4f516bcaa8d4f001763/train/java
public class SumNumbersFrom0ToN {

    public static void main(String[] args) {

        System.out.println(showSequence(7));
    }

    private static String showSequence(int value) {
        int sum = 0;
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i <= value; i++) {
            sBuilder.append(i).append("+");
            sum += i;
        }
        return value > 0 ? sBuilder.substring(0, sBuilder.length() - 1) + " = " + sum : value == 0 ? value + "=" + 0 : value + "<" + 0;
    }
}
