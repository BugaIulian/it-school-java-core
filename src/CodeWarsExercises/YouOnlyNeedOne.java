package CodeWarsExercises;
//https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java

public class YouOnlyNeedOne {
    public static void main(String[] args) {
        Object[] objectArray = new Object[]{80, 117, 115, 104, 45, 85, 112, 115};
        Object oneObject = 115;
        System.out.println(isInArray(objectArray, oneObject));
    }

    public static boolean isInArray(Object[] a, Object x) {
        int i = 0;
        while (i < a.length) {
            if (a[i].equals(x)) {
                return true;
            }
            i++;
        }
        return false;
    }
}

