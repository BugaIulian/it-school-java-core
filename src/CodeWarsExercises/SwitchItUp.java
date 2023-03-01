package CodeWarsExercises;

import java.util.Scanner;



public class SwitchItUp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberProvided = scanner.nextInt();
        String intToString = switch (numberProvided) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";
        };

        System.out.println(intToString);
    }
}

//public class Kata {
//  public static String switchItUp(int number) {
//    return new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}[number];
//  }
//}
