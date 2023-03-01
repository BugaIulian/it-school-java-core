package CodeWarsExercises;

import java.util.Scanner;

public class TotalPoints {
    public static void main(String[] args) {

        String[] matches = new String[10];
        Integer[] scoresHome = new Integer[10];
        Integer[] scoresAway = new Integer[10];
        String[] xHome = new String[10];
        String[] yAway = new String[10];
        int finalScore = 0;


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matches.length; i++) {
            matches[i] = scanner.nextLine();
            matches[i] = matches[i].replace(":", "");
            xHome[i] = matches[i].substring(0, 1);
            yAway[i] = matches[i].substring(1, 2);

        }

        for (int i = 0; i < scoresHome.length; i++) {
            scoresHome[i] = Integer.parseInt(xHome[i]);
            scoresAway[i] = Integer.parseInt(yAway[i]);
        }

        for (int i = 0; i < 10; i++) {
            if (scoresHome[i] == scoresAway[i]) {
                finalScore += 1;
            }
            if (scoresHome[i] > scoresAway[i]) {
                finalScore += 3;

            } else {
                finalScore += 0;

            }
        }

        System.out.println(finalScore);

    }
}

//public class TotalPoints {
//
//    public static int points(String[] games) {
//        int sum = 0;
//
//        for (String s : games) {
//          char x = s.charAt(0),
//               y = s.charAt(2);
//
//          sum += x > y ? 3 : x == y ? 1 : 0;
//        }
//
//        return sum;
//    }
//}
