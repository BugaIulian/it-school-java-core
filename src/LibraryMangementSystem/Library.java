package LibraryMangementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> libraryBookList = new ArrayList<>();
    private List<Member> libraryMemberList = new ArrayList<>();

    public String searchMemberByName(String name) {
        for (Member member : libraryMemberList) {
            if (member.getName().equals(name)) {
                return name + " is a library member.";
            }
        }
        return name + " is not a library member.";
    }

    public List<String> displayAllMembers() {

        List<String> memberNameList = new ArrayList<>();

        for (Member member : libraryMemberList) {
            memberNameList.add(member.getName());
        }
        return memberNameList;
    }

    public void removeLibraryMembers(Member member) {
        libraryMemberList.remove(member);
    }

    public void addLibraryMembers(Member member) {
        libraryMemberList.add(member);
    }

    public void addLibraryBooks(Book book) {
        libraryBookList.add(book);
    }

    public void removeLibraryBooks(Book book) {
        libraryBookList.remove(book);
    }

    public List<String> displayAllLibraryBooks() {
        List<String> allBooks = new ArrayList<>();
        for (Book book : libraryBookList) {
            allBooks.add(book.getBookTitle());
        }
        return allBooks;
    }

    public String searchBooksByTitle(String bookName) {
        for (Book book : libraryBookList) {
            if (book.getBookTitle().equals(bookName)) {
                return "The book is available in the library store";
            }
        }
        return "The Book is not available in the library";
    }

    public String searchBooksByAuthor(String authorName) {
        List<String> booksByAuthor = new ArrayList<>();
        for (Book book : libraryBookList) {
            if (book.getBookAuthorName().equals(authorName)) {
                booksByAuthor.add(book.getBookTitle());
            }
        }
        return "These are the books available in the store written by " + authorName + " :" + booksByAuthor;
    }

    public String searchBooksByISBN(int isbnNumber) {

        for (Book book : libraryBookList) {
            if (book.getIsbnBookNumber() == isbnNumber) {

                return "The book matching the ISBN number provided is available in our store with the title: " + book.getBookTitle();
            }
        }
        return "The book matching the ISBN number provided is not available in our store.";
    }
}
