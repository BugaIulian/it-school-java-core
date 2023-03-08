package CodeWarsExercises;
//https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java

public class ComplementaryDNA {

    public static void main(String[] args) {
        makeComplement("GTAT");
    }

    private static String makeComplement(String attgc) {
        char[] dnaSequence = attgc.toCharArray();
        for (int i = 0; i < dnaSequence.length; i++) {
            char c = dnaSequence[i];
            switch (c) {
                case 'A' -> dnaSequence[i] = 'T';
                case 'T' -> dnaSequence[i] = 'A';
                case 'G' -> dnaSequence[i] = 'C';
                case 'C' -> dnaSequence[i] = 'G';
                default -> throw new IllegalStateException("Unexpected value: " + c);
            }
        }
        return String.valueOf(dnaSequence);
    }
}
