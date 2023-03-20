package LibraryMangementSystem;

import java.util.Date;
import java.util.List;

public class Author extends Member {

    private String authorNationality;
    private Date dateOfBirth;
    private List<Book> authorBookList;


    public String displayAuthorInformation() {
        return getName() + " has the " + authorNationality + " nationality and was born in " + dateOfBirth;
    }

    public void addBooks(Book book) {
        if (authorBookList.contains(book)) {
            System.out.println("This book's Author is already: " + getName());
        } else {
            authorBookList.add(book);
        }
    }

    public void removeBooks(Book book) {
        authorBookList.remove(book);
    }


}
