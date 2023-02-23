package ITC;

import java.util.Random;

public class A23Feb {
    public static void main(String[] args) {

        Random random = new Random();
        int printRandom;
        for (int i = 0; i < 6; i++) {
            printRandom = random.nextInt(1, 49);
            System.out.println(printRandom);
        }
    }
}
