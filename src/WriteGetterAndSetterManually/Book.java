package WriteGetterAndSetterManually;

class Book {

    private String bookTitle;
    private String bookAuthor;
    private int bookPageCount;
    private double bookSells;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPageCount() {
        return bookPageCount;
    }

    public void setBookPageCount(int bookPageCount) {
        this.bookPageCount = bookPageCount;
    }

    public double getBookSells() {
        return bookSells;
    }

    public void setBookSells(double bookSells) {
        this.bookSells = bookSells;
    }

}
