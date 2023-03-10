package OOPExample1;

import java.time.LocalDate;

public class Book extends Utils {
    String bookTitle;
    int bookPrice;
    int bookPageCount;
    LocalDate bookPublicationDate;

    public Book(String authorFirstName, String authorSecondName, String bookTitle, String genre, int bookPrice, int bookPageCount, LocalDate bookPublicationDate) {
        super(authorFirstName, authorSecondName, genre);
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.bookPageCount = bookPageCount;
        this.bookPublicationDate = bookPublicationDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
}


