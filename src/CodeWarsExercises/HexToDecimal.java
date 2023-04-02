package CodeWarsExercises;

public class HexToDecimal {
    public static void main(String[] args) {

        System.out.println(hexToDec("-C"));
    }

    private static int hexToDec(final String hexString) {

        if (hexString.contains("-")) {
            String newString = hexString.substring(1);
            return Integer.decode("0x" + newString) * -1;
        }
        return Integer.decode("0x" + hexString);
    }
}
