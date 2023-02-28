package ITC;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge27Feb {

    static ArrayList<String> graduateStudentList = new ArrayList<>();

    public static void main(String[] args) {

        //Create an array

        String[] shoppingList = {"Milk", "Eggs", "Bread", "Coffee"};

        System.out.println(Arrays.toString(shoppingList));

        //Create an arrayList

        ArrayList<String> wishList = new ArrayList<>();

        wishList.add("MobilePhone");
        wishList.add("New Car");
        wishList.add("Sweets");
        wishList.add("Food");
        wishList.add("Travel");

        System.out.println(wishList);

        //Create two empty arrayList

        ArrayList<String> studentList = new ArrayList<>();


        //Populate studentList with 10 students

        studentList.add("Student1");
        studentList.add("Student2");
        studentList.add("Student3");
        studentList.add("Student4");
        studentList.add("Student5");
        studentList.add("Student6");
        studentList.add("Student7");
        studentList.add("Student8");
        studentList.add("Student9");
        studentList.add("Student10");

        //Copy values from studentList to graduateStudentList
        graduateStudentList.addAll(studentList);

        //Iterate trough graduateStudentList and print each student.

        iterateStudents();
    }

    public static void iterateStudents() {
        for (String student : graduateStudentList) {
            System.out.println(student);
        }
    }
}
