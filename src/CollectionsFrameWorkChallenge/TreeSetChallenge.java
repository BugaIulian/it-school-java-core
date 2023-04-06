package CollectionsFrameWorkChallenge;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetChallenge {

    public static void main(String[] args) {
        TreeSet<String> firstTreeSet = new TreeSet<>(Arrays.asList("Blue", "Red", "White", "Green", "Pink", "Black"));
        printTreeSet(firstTreeSet);
        iterateAndPrintTreeSetElements(firstTreeSet);
        TreeSet<String> secondTreeSet = new TreeSet<>(firstTreeSet);
        reverseAndPrintElementsInATreeSet(secondTreeSet);
        printTheFirstAndLastElementOfATreeSet(secondTreeSet);
        cloneTwoTreeSets();
        printTheNumberOfElementsInATreeSet(secondTreeSet);
        compareTwoTreeSets(firstTreeSet, secondTreeSet);
        findAndPrintNumbersLessThanSevenInATreeSet();
        findAndPrintNumbersGreaterThanOrEqualToAGivenValueInATreeSet(10);
        findAndPrintNumbersLessThanOrEqualToAGivenValueInATreeSet(10);
        findAndPrintTheNumberThatIsStrictlyGreaterThanOrEqualToAGivenValueInATreeSet(10);
        findAndPrintTheNumberThatIsStrictlyLessThanOrEqualToAGivenValueInATreeSet(24);
        retrieveAndRemoveTheFirstElementFromATreeSet(firstTreeSet);
        retrieveAndRemoveTheLastElementFromATreeSet(firstTreeSet);
        removeAGivenElementFromATreeSet(firstTreeSet, "Pink");
    }

    private static void removeAGivenElementFromATreeSet(TreeSet<String> collection, String element) {
        collection.remove(element);
    }

    private static void retrieveAndRemoveTheLastElementFromATreeSet(TreeSet<String> collection) {
        collection.pollLast();
    }

    private static void retrieveAndRemoveTheFirstElementFromATreeSet(TreeSet<String> collection) {
        collection.pollFirst();
    }

    private static void findAndPrintTheNumberThatIsStrictlyLessThanOrEqualToAGivenValueInATreeSet(int value) {
        TreeSet<Integer> numbersTreeSet = new TreeSet<>(Arrays.asList(11, 7, 3, 10, 6, 9, 19, 23, 11));
        System.out.println(numbersTreeSet.floor(value));
    }

    private static void findAndPrintTheNumberThatIsStrictlyGreaterThanOrEqualToAGivenValueInATreeSet(int value) {
        TreeSet<Integer> numbersTreeSet = new TreeSet<>(Arrays.asList(11, 7, 3, 10, 6, 9, 19, 23, 11));
        System.out.println(numbersTreeSet.ceiling(value));
    }

    private static void findAndPrintNumbersLessThanOrEqualToAGivenValueInATreeSet(int value) {
        TreeSet<Integer> numbersTreeSet = new TreeSet<>(Arrays.asList(11, 7, 3, 10, 6, 9, 19, 23));
        System.out.println("The elements less than or equal to 10 in the Tree Set are:" + numbersTreeSet.headSet(10, true));
    }

    private static void findAndPrintNumbersGreaterThanOrEqualToAGivenValueInATreeSet(int value) {
        TreeSet<Integer> numbersTreeSet = new TreeSet<>(Arrays.asList(11, 7, 3, 10, 6, 9, 19, 23));
        System.out.println("The elements greater than or equal to 10 in the Tree Set are:" + numbersTreeSet.tailSet(10, true));
    }
    /**
     * I will use two approaches for this method's logic, first will be the old way(the mandalorian way) and the second
     * way I will use the methods that are specific for a TreeSet collection
     */
    private static void findAndPrintNumbersLessThanSevenInATreeSet() {
        TreeSet<Integer> numbersTreeSet = new TreeSet<>(Arrays.asList(1, 7, 3, 6, 9));
        TreeSet<Integer> emptyList = new TreeSet<>();
        numbersTreeSet.stream()
                .filter(number -> number < 7)
                .forEach(emptyList::add);
        System.out.println("Numbers less than 7 in a new TreeSet using the old ways: " + emptyList);
        TreeSet<Integer> newEmptyList = new TreeSet<>(numbersTreeSet.headSet(7));
        System.out.println("Numbers less than 7 in a new TreeSet using TreeSet specific method: " + newEmptyList);
    }

    private static boolean compareTwoTreeSets(TreeSet<String> firstTreeSet, TreeSet<String> secondTreeSet) {
        return firstTreeSet.equals(secondTreeSet);
    }

    private static void printTheNumberOfElementsInATreeSet(TreeSet<String> collection) {
        /* This can be done with the TreeSet's size(int)  method but also with stream API(long) */
        System.out.println("The number of elements with Stream Api is: " + collection.stream().count());
        System.out.println("The number of elements with TreeSet's size() method is: " + collection.size());
    }

    private static void cloneTwoTreeSets() {
        TreeSet<Integer> originalTreeSet = new TreeSet<>(Arrays.asList(2, 4, 6, 8));
        TreeSet<Integer> clonedTreeSet = new TreeSet<>(originalTreeSet);
    }

    private static void printTheFirstAndLastElementOfATreeSet(TreeSet<String> collection) {
        System.out.println("First element of the TreeSet is: " + collection.first() + " and the last element of the TreeSet is: " + collection.last());
    }

    private static void reverseAndPrintElementsInATreeSet(TreeSet<String> collection) {
        System.out.println(collection.descendingSet());
    }

    private static void iterateAndPrintTreeSetElements(TreeSet<String> collection) {
        collection.forEach(System.out::println);
    }

    private static void printTreeSet(TreeSet<String> collection) {
        System.out.println(collection);
    }
}