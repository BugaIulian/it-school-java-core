package CodeWarsExercises;

//https://www.codewars.com/kata/56530b444e831334c0000020/train/java
public class Chromosomes {
    public static void main(String[] args) {
        System.out.println(chromosomeCheck("XY"));
    }

    private static String chromosomeCheck(String s) {
        return !s.equals("XX") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
    }
}
