package CodeWarsExercises;

//https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9/train/java
public class RowHeights {

    public static void main(String[] args) {
        int[] weights = new int[]{29, 83, 67, 53, 19, 28, 96};
        rowWeights(weights);
    }

    private static int[] rowWeights(int[] weights) {
        int team1 = 0;
        int team2 = 0;
        for (int i = 0; i < weights.length; i++) {
            team1 = team1 + weights[i++];
        }
        for (int i = 1; i < weights.length; i++) {
            team2 = team2 + weights[i++];
        }
        int[] result = new int[]{team1, team2};
        return result;
    }
}
