package LibraryMangementSystem;

import java.util.Date;

public class Book {
    private String bookTitle;
    private Author authorName;
    private String bookPublisher;
    private String isbn;
    private int numberOfCopies;
    private Date dueDate;
    public Date getDueDate() {
        return dueDate;
    }


}
