package CodeForces849;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputScanner = scanner.nextInt();
        String codeForces = "codeforces";

        for (char c = 'a'; c < 'a' + inputScanner; c++) {
            System.out.print(c + " ");
            if (codeForces.indexOf(c) >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}

