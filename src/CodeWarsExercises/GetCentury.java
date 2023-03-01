package CodeWarsExercises;

import java.text.ParseException;

import java.util.Scanner;

public class GetCentury {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        int typeYear = scanner.nextInt();
        int century = typeYear /100;
        if (typeYear % 100 != 0) {
            century++;
        }
        System.out.println(century);

    }
}

//public class Solution {
//  public static int century(int number) {
//    return (number + 99) / 100;
//  }
//}
