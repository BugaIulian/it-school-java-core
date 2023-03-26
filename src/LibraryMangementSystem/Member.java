package LibraryMangementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String address;
    private String contactInformation;
    private List<Book> borrowedBooks = new ArrayList<>();
    private LocalDate membershipExpirationTime;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public List<String> displayBorrowedBooks() {
        List<String> borrowedBookList = new ArrayList<>();
        if (borrowedBooks.isEmpty()) {
            System.out.println("Nothing to return to the library.");
        }
        for (Book book : borrowedBooks) {
            borrowedBookList.add(book.getBookTitle());
        }
        return borrowedBookList;
    }

    public boolean isOverdue() {
        LocalDate now = LocalDate.now();
        //need help, I can't create a logic for it...
        return false;
    }
}
