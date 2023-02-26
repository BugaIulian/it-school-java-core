package CodeWarsProblems;

/* Character recognition software is widely used to digitise printed texts.
Thus the texts can be edited, searched and stored on a computer.
When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.
Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
S is misinterpreted as 5
O is misinterpreted as 0
I is misinterpreted as 1
The test cases contain numbers only by mistake. */
public class CorrectMistakesInString {

    public static int STRING_CHARACTERS = 0;

    public static void main(String[] args) {


        String testString = "R0BERT MERLE - THE DAY 0F THE D0LPH1N";
        String outPutString = "";
        char[] testStringChars = testString.toCharArray();
        char c = ' ';

        for (STRING_CHARACTERS = 0; STRING_CHARACTERS < testStringChars.length; STRING_CHARACTERS++) {
            c = testStringChars[STRING_CHARACTERS];
            switch (c) {
                case '1':
                    testStringChars[STRING_CHARACTERS] = 'I';
                    break;
                case '0':
                    testStringChars[STRING_CHARACTERS] = 'O';
                    break;
                case '5':
                    testStringChars[STRING_CHARACTERS] = 'S';
                    break;

            }
        }



        System.out.println(String.valueOf(testStringChars));

    }
}

/* public class Correct {
  public static String correct(String string) {
    return string.replace("5","S").replace("0", "O").replace("1","I");
  }
} */
