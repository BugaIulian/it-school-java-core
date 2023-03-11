package CodeWarsExercises;

import java.math.BigInteger;

//https://www.codewars.com/kata/525f4206b73515bffb000b21/train/java
public class AddingBigNumbersCHEAT {
    public static void main(String[] args) {


        System.out.println(add("189", "21"));

    }

    public static String add(String a, String b) {

        BigInteger n1 = new BigInteger(a);
        BigInteger n2 = new BigInteger(b);
        BigInteger sumOfNumbers;
        sumOfNumbers = n1.add(n2);

        return String.valueOf(sumOfNumbers);
    }
}
