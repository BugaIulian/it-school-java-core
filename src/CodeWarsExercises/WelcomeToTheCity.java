package CodeWarsExercises;

import java.util.Arrays;

//https://www.codewars.com/kata/5302d846be2a9189af0001e4/train/java
public class WelcomeToTheCity {
    public static void main(String[] args) {
        String[] nameArray = new String[]{"John", "Smith"};
        System.out.println(sayHello(nameArray, "Phoenix","Arizona"));
    }

    public static String sayHello(String [] name, String city, String state){
        //code here
        StringBuilder nameString = new StringBuilder();
        for (String nameArray : name) {
            nameString.append(nameArray + " ");
        }
        String newString = nameString.toString();
        String subS = newString.substring(0,nameString.length()-1);

        return "Hello " + subS + "! Welcome to " + city + ", " + state + "!";

    }
}
