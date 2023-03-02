package EdabitExercises;

public class ReverseOrder {
    public static String reverse(final String str) {
        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append(str);

        strBuilder.reverse();

        return strBuilder.toString();
    }
}
