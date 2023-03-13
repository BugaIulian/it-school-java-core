package WriteConstructorsManually;

import java.time.LocalDate;

public class Book {
    private String title;
    private String authorName;
    private LocalDate releaseDate;
    private int pageCount;

    public Book(String title, String authorName, LocalDate releaseDate, int pageCount) {
        this.title = title;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
        this.pageCount = pageCount;
    }
}
