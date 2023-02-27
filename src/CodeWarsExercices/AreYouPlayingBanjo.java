package CodeWarsExercices;

import java.util.Scanner;

public class AreYouPlayingBanjo {
    public static void main(String[] args) {

        String name;
        String namePlaysBanjo;
        Scanner scanner = new Scanner(System.in);

        name = scanner.next();

        String firstCh = name.substring(0, 1);
        switch (firstCh) {
            case "R", "r" -> System.out.println(name + " plays banjo");
            default -> System.out.println(name + " does not play banjo");
        }

    }
}
