package CodeWarsExercises;

//https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java
public class WhatIsBetween {

    public static void main(String[] args) {
        between(2, 8);
    }

    private static int[] between(int a, int b) {
        int[] numbersBetween = new int[(b - a) + 1];
        for (int i = 0; i < numbersBetween.length; i++) {
            numbersBetween[i] = a++;
        }
            return numbersBetween;
    }
}
