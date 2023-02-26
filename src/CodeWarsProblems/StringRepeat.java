package CodeWarsProblems;

import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeat = scanner.nextInt();
        String string = scanner.next();
        String newExitString = "";

        for (int i= 0; i <= repeat;i++) {
            newExitString = string.repeat(i);
        }
        System.out.println(newExitString);
    }
}
