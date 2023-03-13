package CodeWarsExercises;
//https://www.codewars.com/kata/54fdaa4a50f167b5c000005f/train/java
import java.util.HashMap;

public class HashMapUnexpectedParsing {
    public static void main(String[] args) {
        getStatus(false);
    }

    public static HashMap<String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();
        if (isBusy) {
            status.put("status", "busy");
        } else {
            status.put("status", "available");
        }

        return status;
    }
}
