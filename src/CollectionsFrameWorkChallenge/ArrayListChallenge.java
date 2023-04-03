package CollectionsFrameWorkChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListChallenge {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Black");
        System.out.println(colorList);
        for (String element : colorList) {
            System.out.println(element);
        }
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
        List<String> cloneList = new ArrayList<>(colorList);
        cloneList.clear();
        cloneList.isEmpty(); // evaluate returns true
        ArrayList<Integer> someNumbers = new ArrayList<>(6);
        someNumbers.add(10);
        someNumbers.add(1);
        someNumbers.add(12);
        someNumbers.add(2);
        someNumbers.add(12);
        someNumbers.add(112);
        someNumbers.add(122);
        someNumbers.trimToSize();
        someNumbers.ensureCapacity(8);
    }
}
