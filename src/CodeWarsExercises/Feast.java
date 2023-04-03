package CodeWarsExercises;

//https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
public class Feast {
    public static void main(String[] args) {
        animalFeast("garlic", "7reenbeans");
    }

    private static boolean animalFeast(String str1, String str2) {

        String firstLetter = str1.substring(0, 1);
        String secondLetter = str2.substring(0, 1);
        String lastLetter1 = str1.substring(str1.length() - 1);
        String lastLetter2 = str2.substring(str2.length() - 1);
        return firstLetter.equals(secondLetter) && lastLetter1.equals(lastLetter2);
    }
}
