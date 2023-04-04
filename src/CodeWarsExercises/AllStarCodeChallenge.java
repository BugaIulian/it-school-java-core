package CodeWarsExercises;
//https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
public class AllStarCodeChallenge {
    public static void main(String[] args) {
        countOccurences("Hello", 'l');
        System.out.println(countOccurences("helllllo",'l'));
    }

    private static int countOccurences(String str, char ch) {
        return (int)str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
