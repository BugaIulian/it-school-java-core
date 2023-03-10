package OOPExample1;

import java.time.LocalDate;
import java.util.Scanner;

public class LibraryApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Author firstAuthor = new Author(writeFirstName(), writeSecondName(), writeGenreSpecific(), "Media Central", "Colour INC");
        Book firstBook = new Book(firstAuthor.getAuthorFirstName(), firstAuthor.getAuthorSecondName(), writeBookTitle(), firstAuthor.getGenre(), 20, 2100, LocalDate.now());
        System.out.println("The first book that arrived on our shelters is " + firstAuthor.getAuthorFirstName() + " " + firstAuthor.getAuthorSecondName() + ", " + firstAuthor.getAuthorFirstName()
                + " prefers the " + firstAuthor.getGenre() + " genre.");
        System.out.println("His new book " + "'" + firstBook.getBookTitle() + "'" + " is a major world wide success with over one million sells. You can buy the book from our website with only "
                + firstBook.getBookPrice() + " dollars" + "But hurry up, the offer is available only on " + LocalDate.now().getMonth());
    }


    private static String writeFirstName() {
        System.out.println("Please write the author's name:");
        return scanner.nextLine();
    }

    private static String writeSecondName() {
        System.out.println("Please write the author's second name:");
        return scanner.nextLine();
    }

    private static String writeGenreSpecific() {
        System.out.println("Please write the author's preferred genre:");
        return scanner.nextLine();
    }

    private static String writeBookTitle() {
        System.out.println("Please write the book title:");
        return scanner.nextLine();
    }
}
