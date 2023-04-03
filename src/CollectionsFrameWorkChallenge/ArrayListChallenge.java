package CollectionsFrameWorkChallenge;

import java.util.*;

public class ArrayListChallenge {

    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Black");
        printStringList(colorList);
        colorList.add(0, "Purple");
        colorList.remove(3);
        colorList.set(2, "Pink");
        colorList.remove(2);
        colorList.contains("Red"); // evaluate returns true
        Collections.sort(colorList);
        List<String> copiedList = new ArrayList<>(colorList); // or copiedList.addAll(colorList);
        Collections.shuffle(copiedList);
        Collections.reverse(colorList);
        System.out.println(colorList.subList(0, 1));
        colorList.equals(copiedList); // evaluate returns false
        Collections.swap(colorList, 0, 1);
        List<String> carList = Arrays.asList("Kia", "Bmw", "Logan");
        colorList.addAll(carList);
        List<String> cloneListOfColorList = new ArrayList<>(colorList);
        cloneListOfColorList.clear();
        cloneListOfColorList.isEmpty(); // evaluate returns true
        ArrayList<Integer> someNumbers = new ArrayList<>(6);
        addNumbersToList(someNumbers);
        someNumbers.trimToSize();
        someNumbers.ensureCapacity(8);
    }

    private static void addNumbersToList(List<Integer> someNumbers) {
        int randomNumberToAddToTheList = 0;
        for (int i = 0; i < 6; i++) {
            Random randomNumbers = new Random();
            randomNumberToAddToTheList = randomNumbers.nextInt(0, 120);
            someNumbers.add(randomNumberToAddToTheList);
        }
    }

    private static void printStringList(List<String> colorList) {
        for (String element : colorList) {
            System.out.println(element);
        }
    }
}
