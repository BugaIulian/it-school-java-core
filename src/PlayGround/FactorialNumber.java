package PlayGround;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int factorial = 1;

        int i = 1;

        while(i <= number) {
            factorial = factorial * i;
            i++;
            System.out.println(factorial);
        }
        System.out.println(factorial);
    }
}
