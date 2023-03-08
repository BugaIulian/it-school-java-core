package CodeWarsExercises;

public class XO {
    public static void main(String[] args) {
        isSameAmount("xooxxolk");
    }

    public static Boolean isSameAmount(String inputString) {
        char[] charsArray = inputString.toCharArray();
        int xNumber = 0;
        int oNumber = 0;
        for (char c : charsArray) {
            switch (c) {
                case 'x', 'X' -> xNumber++;
                case 'o', 'O' -> oNumber++;
            }
        }
        return xNumber == oNumber;
    }
}
