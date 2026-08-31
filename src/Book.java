public class Book {
    private static int nextId = 1;

    private int bookId;
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.bookId = nextId++;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book otherBook = (Book) obj;
            return this.bookId == otherBook.bookId;
        }
        return false;
    }

    @Override
    public String toString() {
        String status;

        if (available) {
            status = "Available";
        } else {
            status = "Borrowed";
        }

        return "Book ID: " + bookId +
                ", Title: " + title +
                ", Author: " + author +
                ", Status: " + status;
    }
}
