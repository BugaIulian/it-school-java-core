package CodeWarsExercises;

//https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(rps("scissors", "scissors"));
    }

    public static String rps(String p1, String p2) {
        // your code
        StringBuilder outputString = new StringBuilder();

        switch (p1) {
            case "scissors" -> {
                if (p2.equals("paper")) {
                    outputString.append("Player 1 won!");
                } else if (p2.equals("rock")) {
                    outputString.append("Player 2 won!");
                }
            }
            case "paper" -> {
                if (p2.equals("rock")) {
                    outputString.append("Player 1 won!");
                } else if (p2.equals("scissors")) {
                    outputString.append("Player 2 won!");
                }
            }
            case "rock" -> {
                if (p2.equals("paper")) {
                    outputString.append("Player 2 won!");
                } else if (p2.equals("scissors")) {
                    outputString.append("Player 1 won!");
                }
            }
        }
        if (p1.equals(p2)) {
            outputString.append("Draw!");
        }
        return String.valueOf(outputString);
    }
}

//public class Kata {
//  public static String rps(String p1, String p2) {
//    return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
//  }
//}
