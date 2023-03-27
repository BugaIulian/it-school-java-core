package CodeWarsExercises;

//https://www.codewars.com/kata/56598d8076ee7a0759000087/train/java
public class TipCalculator {
    public static void main(String[] args) {
        /* Test Case */
        calculateTip(52.3, "great");
    }

    private static Integer calculateTip(double amount, String rating) {
        double tipAmount = 0;

        switch (rating.toLowerCase()) {

            case "terrible":
                tipAmount = 0;
                break;
            case "poor":
                tipAmount = amount * 0.05;
                break;
            case "good":
                tipAmount = amount * 0.1;
                break;
            case "great":
                tipAmount = amount * 0.15;
                break;
            case "excellent":
                tipAmount = amount * 0.2;
                break;
            default:
                return null;
        }
        return (int) Math.ceil(tipAmount);
    }
}
