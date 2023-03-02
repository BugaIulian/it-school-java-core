package ITC;

import java.util.ArrayList;
import java.util.List;

public class Challenge27Feb {
    public static void main(String[] args) {

        String[] shoppingList = {"Milk", "Eggs", "Bread", "Coffee"};
        for (String item : shoppingList) {
            System.out.println(item);
        }
        List<String> wishList = new ArrayList<>();
        String[] wishListItems = new String[]{"Mobile Phone", "New Car", "Sweets", "Food", "Travel"};
        for (String item : wishListItems) {
            wishList.add(item);
        }
        System.out.println(wishList);
        List<String> studentList = new ArrayList<>();
        String[] studentNames = new String[]{"John", "Mary", "Daniel", "Joshua", "Mark", "Liam", "Paul", "Anne", "Ben", "Michael"};

        for (String name : studentNames) {
            studentList.add(name);
        }
        ArrayList<String> graduateStudentList = new ArrayList<>();
        graduateStudentList.addAll(studentList);
        for (String student : graduateStudentList) {
            System.out.println(student);
        }
    }
}
