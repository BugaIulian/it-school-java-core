package CodeWarsExercises;

public class StringToInteger {
    public static void main(String[] args) {

        FakeBinary newObject = new FakeBinary();
        String stringTest = newObject.fakeBin("453933568");
        System.out.println(stringTest);

    }
}

class FakeBinary {
    public String fakeBin(String numberString) {

        String result = "";

        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            if (c < '5') {
                result += "0";
            } else {
                result += "1";
            }
        }

        return result;
    }
}

//public class FakeBinary {
//    public static String fakeBin(String numberString) {
//        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
//    }
//}