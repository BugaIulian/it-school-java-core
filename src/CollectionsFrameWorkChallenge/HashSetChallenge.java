package CollectionsFrameWorkChallenge;

import java.util.*;

public class HashSetChallenge {

    public static void main(String[] args) {
        HashSet<String> firstHashSet = new HashSet<>(Arrays.asList("Dog", "Cat", "Tiger", "Kangaroo"));
        HashSet<String> secondHashSet = new HashSet<>(Arrays.asList("Italy", "France", "United Kingdom"));
        HashSet<Integer> firstNumberHashSet = new HashSet<>(Arrays.asList(2, 4, 6));
        HashSet<Integer> secondNumberHashSet = new HashSet<>(Arrays.asList(1, 6));
        appendASpecifiedElementAtTheEndOfHashSet(firstHashSet);
        printElementsFromHashSet(firstHashSet);
        printNumberOfElementsFromHashSet(firstHashSet);
        emptyHashSet(firstHashSet);
        isEmpty(firstHashSet); // evaluate return true.
        HashSet<String> thirdHashSet = new HashSet<>(secondHashSet);
        convertHashSetToArray(thirdHashSet);
        convertHashSetToTreeSet(thirdHashSet);
        convertHashSetToList(thirdHashSet);
        compareTwoHashSets(secondHashSet, thirdHashSet); // evaluate return true.
        compareAndPrintCommonElementsFromTwoHashSets(firstNumberHashSet, secondNumberHashSet);
        removeAllElementsFromAHashSet(thirdHashSet);
    }

    private static void removeAllElementsFromAHashSet(HashSet<String> collection) {
        collection.clear();
    }

    private static void compareAndPrintCommonElementsFromTwoHashSets(HashSet<Integer> collection1, HashSet<Integer> collection2) {
        collection1.retainAll(collection2);
        System.out.println(collection1);
    }

    private static boolean compareTwoHashSets(HashSet<String> secondHashSet, HashSet<String> thirdHashSet) {
        return secondHashSet.equals(thirdHashSet);
    }

    private static void convertHashSetToList(HashSet<String> collection) {
        List<String> listString = new ArrayList<>(collection);
    }

    private static void convertHashSetToTreeSet(HashSet<String> collection) {
        TreeSet<String> treeMap = new TreeSet<>(collection);
    }

    private static void convertHashSetToArray(HashSet<String> collection) {
        collection.toArray();
    }

    private static boolean isEmpty(HashSet<String> collection) {
        return collection.isEmpty();
    }

    private static void emptyHashSet(HashSet<String> collection) {
        collection.clear();
    }

    private static void printNumberOfElementsFromHashSet(HashSet<String> collection) {
        System.out.println(collection.size());
    }

    private static void printElementsFromHashSet(HashSet<String> collection) {
        collection.forEach(System.out::println);
    }

    private static void appendASpecifiedElementAtTheEndOfHashSet(HashSet<String> collection) {
        //I'm not entirely sure if this can be done. A hash set collection will store elements in no particular order.
        //I had a look on all the methods from this collection and couldn't find a way to do it. Actually there is no index to help me on this one.
    }
}
