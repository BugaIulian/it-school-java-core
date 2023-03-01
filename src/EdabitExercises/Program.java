package EdabitExercises;

public class Program {
    public StringBuilder nameShuffle(String s) {
        String[] nameArray = s.split("\\s");
        String name1 = nameArray[1];
        String name2 = nameArray[0];


        return new StringBuilder(name1 + " " + name2);
    }
}
