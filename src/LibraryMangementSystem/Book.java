package LibraryMangementSystem;

import java.time.LocalDate;

public class Book {
    private String bookTitle;
    private Author authorName;
    private String bookPublisher;
    private int isbnBookNumber;
    private int numberOfCopies;
    private LocalDate dueDate;

    public Book(String bookTitle, Author authorName, String bookPublisher, int isbnBookNumber, int numberOfCopies, LocalDate dueDate) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.bookPublisher = bookPublisher;
        this.isbnBookNumber = isbnBookNumber;
        this.numberOfCopies = numberOfCopies;
        this.dueDate = dueDate;
    }

    public int getIsbnBookNumber() {
        return isbnBookNumber;
    }

    public String getBookAuthorName() {
        return authorName.getName();
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public LocalDate getDueDate() {
        dueDate = LocalDate.now().minusDays(30);
        return dueDate;
    }

    public void addCopies() {
        numberOfCopies++;
    }

    public void removeCopies() {
        numberOfCopies--;
    }

    public String displayBookInfo() {
        return "Book info: The book title is " + bookTitle + " and the author is " + authorName.getName() + ". The publisher is " + bookPublisher + " and ISBN info:" + isbnBookNumber + ". The number of copies:" + numberOfCopies;
    }

    public boolean isAvailable() {
        return numberOfCopies > 0;
    }
}
