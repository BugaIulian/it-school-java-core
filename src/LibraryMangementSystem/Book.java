package LibraryMangementSystem;

import java.time.LocalDate;

public class Book {
    private String bookTitle;
    private Author authorName;
    private String bookPublisher;
    private int isbn;
    private int numberOfCopies;
    private LocalDate dueDate;

    public Book(String bookTitle, Author authorName, String bookPublisher, int isbn, int numberOfCopies, LocalDate dueDate) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.bookPublisher = bookPublisher;
        this.isbn = isbn;
        this.numberOfCopies = numberOfCopies;
        this.dueDate = dueDate;
    }

    public int getIsbn() {
        return isbn;
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
        return "Book info: The book title is " + bookTitle + " and the author is " + authorName.getName() + ". The publisher is " + bookPublisher + " and ISBN info:" + isbn + ". The number of copies:" + numberOfCopies;
    }

    public boolean isAvailable() {
        return numberOfCopies > 0;
    }
}
