import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LibrarySystem system = new LibrarySystem();
        int choice;

        do {
            System.out.println();
            System.out.println("===== Library System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Important Book");
            System.out.println("3. Add Member");
            System.out.println("4. Add Librarian");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Reserve Book");
            System.out.println("8. Display Next Reserved Book");
            System.out.println("9. Process Next Reservation");
            System.out.println("10. Calculate Late Fee");
            System.out.println("11. Update Book By Index");
            System.out.println("12. Remove Book By Index");
            System.out.println("13. Search Book By ID");
            System.out.println("14. Check Book Exists");
            System.out.println("15. Display Book Index");
            System.out.println("16. Display Books");
            System.out.println("17. Display Members");
            System.out.println("18. Display Librarians");
            System.out.println("19. Count Available Books Recursively");
            System.out.println("20. Clear All Books");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = input.nextLine();

                    System.out.print("Enter book author: ");
                    String author = input.nextLine();

                    Book book = new Book(title, author);
                    system.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter important book title: ");
                    String importantTitle = input.nextLine();

                    System.out.print("Enter important book author: ");
                    String importantAuthor = input.nextLine();

                    Book importantBook = new Book(importantTitle, importantAuthor);
                    system.addImportantBook(importantBook);
                    break;

                case 3:
                    System.out.print("Enter member name: ");
                    String memberName = input.nextLine();

                    System.out.print("Enter member phone: ");
                    String memberPhone = input.nextLine();

                    Member member = new Member(memberName, memberPhone);
                    system.addMember(member);
                    break;

                case 4:
                    System.out.print("Enter librarian name: ");
                    String librarianName = input.nextLine();

                    System.out.print("Enter librarian phone: ");
                    String librarianPhone = input.nextLine();

                    Librarian librarian = new Librarian(librarianName, librarianPhone);
                    system.addLibrarian(librarian);
                    break;

                case 5:
                    System.out.print("Enter book ID to borrow: ");
                    int borrowId = input.nextInt();
                    input.nextLine();

                    system.borrowBook(borrowId);
                    break;

                case 6:
                    System.out.print("Enter book ID to return: ");
                    int returnId = input.nextInt();
                    input.nextLine();

                    system.returnBook(returnId);
                    break;

                case 7:
                    System.out.print("Enter book ID to reserve: ");
                    int reserveId = input.nextInt();
                    input.nextLine();

                    system.reserveBook(reserveId);
                    break;

                case 8:
                    system.displayNextReservedBook();
                    break;

                case 9:
                    system.processNextReservation();
                    break;

                case 10:
                    System.out.print("Enter number of late days: ");
                    int daysLate = input.nextInt();
                    input.nextLine();

                    double fee = system.calculateLateFee(daysLate);
                    System.out.println("Late fee is: $" + fee);
                    break;

                case 11:
                    System.out.print("Enter book index to update: ");
                    int updateIndex = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter new title: ");
                    String newTitle = input.nextLine();

                    System.out.print("Enter new author: ");
                    String newAuthor = input.nextLine();

                    system.updateBookByIndex(updateIndex, newTitle, newAuthor);
                    break;

                case 12:
                    System.out.print("Enter book index to remove: ");
                    int removeIndex = input.nextInt();
                    input.nextLine();

                    system.removeBookByIndex(removeIndex);
                    break;

                case 13:
                    System.out.print("Enter book ID to search: ");
                    int searchId = input.nextInt();
                    input.nextLine();

                    system.searchBookAndDisplay(searchId);
                    break;

                case 14:
                    System.out.print("Enter book ID to check: ");
                    int checkId = input.nextInt();
                    input.nextLine();

                    system.checkBookExists(checkId);
                    break;

                case 15:
                    System.out.print("Enter book ID: ");
                    int indexId = input.nextInt();
                    input.nextLine();

                    system.displayBookIndex(indexId);
                    break;

                case 16:
                    system.displayBooks();
                    break;

                case 17:
                    system.displayMembers();
                    break;

                case 18:
                    system.displayLibrarians();
                    break;

                case 19:
                    system.displayAvailableBooksCount();
                    break;

                case 20:
                    system.clearAllBooks();
                    break;

                case 0:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        input.close();
    }
}
