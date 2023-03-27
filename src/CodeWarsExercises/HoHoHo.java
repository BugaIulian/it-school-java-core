package CodeWarsExercises;

//https://www.codewars.com/kata/52adc142b2651f25a8000643/train/java
public class HoHoHo {
    public static void main(String[] args) {
        System.out.println(authenticate("Santa Claus", "Ho Ho Ho!"));
    }

    private static boolean authenticate(String santaClaus, String s) {


        return santaClaus.equals("Santa Claus") && s.equals("Ho Ho Ho!");
    }
}
