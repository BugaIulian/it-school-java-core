package LibraryMangementSystem;

import java.util.Date;
import java.util.List;

public class Member {
    private String name;
    private String address;
    private String contactInformation;
    private List<Book> borrowedBooks;
    private Date membershipExpirationTime;

    public String getName() {
        return name;
    }

    private void borrowBook(Book book) {
        if (borrowedBooks.contains(book)) {
            System.out.println("You already borrowed this book!");
        } else {
            borrowedBooks.add(book);
        }
    }

    private void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    private List<Book> displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Nothing to return to the library.");
        }
        return borrowedBooks;
    }

    private boolean isOverdue() {
        Date currentDate = new Date();
        for (Book book : borrowedBooks) {
            if (book.getDueDate().before(currentDate)) {
                return true;
            }
        }
        return false;
    }
}
