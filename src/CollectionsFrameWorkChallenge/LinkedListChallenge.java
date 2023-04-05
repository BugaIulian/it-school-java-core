package CollectionsFrameWorkChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListChallenge {

    public static void main(String[] args) {
        LinkedList<Integer> firstNumberList = new LinkedList<>(Arrays.asList(2, 4, 5, 1, 10));
        firstNumberList.add(25);
        iterateTroughLinkedList(firstNumberList);
        iterateTroughLinkedListFromASpecificIndex(firstNumberList, 2);
        iterateTroughLinkedListInReverseOrder(firstNumberList);
        firstNumberList.add(0, 20);
        firstNumberList.add(0, 224);
        firstNumberList.add(firstNumberList.size(), 299);
        firstNumberList.addFirst(1000);
        firstNumberList.addLast(1001);
        firstNumberList.add(2, 222);
        LinkedList<Integer> secondNumberList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 2));
        findFirstAndLastOccurrenceOfSpecifiedElement(secondNumberList);
        displayElementsAndPositionInLinkedList(secondNumberList);
        secondNumberList.remove(Integer.valueOf(2)); // Integer.valueOf, the remove method expects an object otherwise it will take the primitive as the index.
        secondNumberList.removeFirst();
        secondNumberList.removeLast();
        secondNumberList.clear();
        secondNumberList.add(0, 1);
        secondNumberList.add(1, 9);
        Collections.swap(secondNumberList, 0, 1);
        Collections.shuffle(secondNumberList);
        secondNumberList.addAll(firstNumberList);
        LinkedList<Integer> thirdNumberList = new LinkedList<>(secondNumberList);
        thirdNumberList.poll(); // had to google this, i think this method is specific to the LinkedList structure.
        thirdNumberList.getFirst();
    }

    private static void displayElementsAndPositionInLinkedList(LinkedList<Integer> someNumbers) {
        int index = 0; // yeah, I know this is evil, this could've easily been done with a for loop to get the index.
        for (int number : someNumbers) {
            System.out.println(number + " is at index:" + index);
            index++;
        }
    }

    private static void findFirstAndLastOccurrenceOfSpecifiedElement(LinkedList<Integer> someNumbers) {
        System.out.println("First occurrence of 2 at index " + someNumbers.indexOf(2) + " and last occurrence of 2 at index " + someNumbers.lastIndexOf(2));
    }

    private static void iterateTroughLinkedListInReverseOrder(LinkedList<Integer> linkedList) {
        Collections.reverse(linkedList);
        linkedList.forEach(numbers -> System.out.println(numbers));
    }

    private static void iterateTroughLinkedListFromASpecificIndex(LinkedList<Integer> linkedList, int index) {
        List<Integer> subList = linkedList.subList(index, linkedList.size());
        for (int number : subList) {
            System.out.println(number);
        }
    }

    private static void iterateTroughLinkedList(LinkedList<Integer> linkedList) {
        for (int number : linkedList) {
            System.out.println(number);
        }
    }
}