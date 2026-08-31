import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Queue;

public class LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private ArrayList<Librarian> librarians;
    private Queue<Book> reservationQueue;

    public LibrarySystem() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        librarians = new ArrayList<>();
        reservationQueue = new ArrayDeque<>();
    }

    // Big-O: O(1)
    public void addBook(Book book) {
        books.add(book); // ArrayList add(E)
        System.out.println("Book added successfully.");
    }

    // Big-O: O(n)
    public void addImportantBook(Book book) {
        books.add(0, book); // ArrayList add(index, E)
        System.out.println("Important book added at the beginning successfully.");
    }

    // Big-O: O(1)
    public void addMember(Member member) {
        members.add(member); // ArrayList add(E)
        System.out.println("Member added successfully.");
    }

    // Big-O: O(1)
    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian); // ArrayList add(E)
        System.out.println("Librarian added successfully.");
    }

    // Big-O: O(n)
    public void borrowBook(int bookId) {
        Book book = searchBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book borrowed successfully.");
        } else {
            reservationQueue.offer(book); // Queue offer()
            System.out.println("Book is not available now. It was added to the reservation queue.");
        }
    }

    // Big-O: O(n)
    public void returnBook(int bookId) {
        Book book = searchBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("This book is already available.");
            return;
        }

        book.setAvailable(true);
        System.out.println("Book returned successfully.");
    }

    // Big-O: O(n)
    public void reserveBook(int bookId) {
        Book book = searchBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("Book is available now. You can borrow it directly.");
        } else {
            reservationQueue.offer(book); // Queue offer()
            System.out.println("Book reserved successfully.");
        }
    }

    // Big-O: O(1)
    public void displayNextReservedBook() {
        Book book = reservationQueue.peek(); // Queue peek()

        if (book == null) {
            System.out.println("There are no reserved books.");
        } else {
            System.out.println("Next reserved book:");
            System.out.println(book);
        }
    }

    // Big-O: O(1)
    public void processNextReservation() {
        Book book = reservationQueue.peek(); // Queue peek()

        if (book == null) {
            System.out.println("There are no reserved books.");
            return;
        }

        if (book.isAvailable()) {
            reservationQueue.poll(); // Queue poll()
            book.setAvailable(false);
            System.out.println("The next reserved book was borrowed successfully.");
            System.out.println(book);
        } else {
            System.out.println("The next reserved book is still not available.");
        }
    }

    // Big-O: O(1)
    public double calculateLateFee(int daysLate) {
        if (daysLate <= 0) {
            return 0;
        }

        return daysLate * 1.0;
    }

    // Big-O: O(1)
    public void updateBookByIndex(int index, String newTitle, String newAuthor) {
        if (index < 0 || index >= books.size()) { // ArrayList size()
            System.out.println("Invalid index.");
            return;
        }

        Book updatedBook = new Book(newTitle, newAuthor);
        books.set(index, updatedBook); // ArrayList set(index, E)
        System.out.println("Book replaced successfully.");
    }

    // Big-O: O(n)
    public void removeBookByIndex(int index) {
        if (index < 0 || index >= books.size()) { // ArrayList size()
            System.out.println("Invalid index.");
            return;
        }

        books.remove(index); // ArrayList remove(index)
        System.out.println("Book removed successfully.");
    }

    // Big-O: O(n)
    public Book searchBookById(int bookId) {
        for (int i = 0; i < books.size(); i++) { // ArrayList size()
            Book book = books.get(i); // ArrayList get(index)

            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    // Big-O: O(n)
    public void searchBookAndDisplay(int bookId) {
        Book book = searchBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
        } else {
            System.out.println(book);
        }
    }

    // Big-O: O(n)
    public void checkBookExists(int bookId) {
        Book book = searchBookById(bookId);

        if (book != null && books.contains(book)) { // ArrayList contains()
            System.out.println("Book exists in the list.");
        } else {
            System.out.println("Book does not exist in the list.");
        }
    }

    // Big-O: O(n)
    public void displayBookIndex(int bookId) {
        Book book = searchBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        int index = books.indexOf(book); // ArrayList indexOf()
        System.out.println("Book index is: " + index);
    }

    // Big-O: O(n)
    public void displayBooks() {
        if (books.isEmpty()) { // ArrayList isEmpty()
            System.out.println("No books found.");
            return;
        }

        for (int i = 0; i < books.size(); i++) { // ArrayList size()
            System.out.println("Index " + i + " -> " + books.get(i)); // ArrayList get(index)
        }
    }

    // Big-O: O(n)
    public void displayMembers() {
        if (members.isEmpty()) { // ArrayList isEmpty()
            System.out.println("No members found.");
            return;
        }

        for (int i = 0; i < members.size(); i++) { // ArrayList size()
            System.out.println(members.get(i)); // ArrayList get(index)
        }
    }

    // Big-O: O(n)
    public void displayLibrarians() {
        if (librarians.isEmpty()) { // ArrayList isEmpty()
            System.out.println("No librarians found.");
            return;
        }

        for (int i = 0; i < librarians.size(); i++) { // ArrayList size()
            System.out.println(librarians.get(i)); // ArrayList get(index)
        }
    }

    // Big-O: O(n)
    public void clearAllBooks() {
        books.clear(); // ArrayList clear()
        reservationQueue.clear();
        System.out.println("All books were removed.");
    }

    public void displayAvailableBooksCount() {
        int count = countAvailableBooksRecursive(0);
        System.out.println("Number of available books: " + count);
    }

    // Recursive Method
    // Big-O: O(n)
    public int countAvailableBooksRecursive(int index) {
        if (index >= books.size()) {
            return 0;
        }

        if (books.get(index).isAvailable()) {
            return 1 + countAvailableBooksRecursive(index + 1);
        }

        return countAvailableBooksRecursive(index + 1);
    }
}
