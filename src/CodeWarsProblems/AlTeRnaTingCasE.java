package CodeWarsProblems;

public class AlTeRnaTingCasE {
    public static void main(String[] args) {
        String testString = "AltERnaTIng cAsE";
        char[] charsArray = testString.toCharArray();

        for (int i = 0; i < charsArray.length; i++) {
            if (Character.isUpperCase(charsArray[i])) {
                charsArray[i] = Character.toLowerCase(charsArray[i]);
            } else {
                charsArray[i] = Character.toUpperCase(charsArray[i]);
            }


        }
        System.out.println(String.valueOf(charsArray));
    }
}
