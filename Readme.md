# Library Management System 📚

A console-based **Library Management System** built in **Java** to practice Object-Oriented Programming and fundamental Data Structures.

The project manages books, library members, librarians, borrowing, returning, and book reservations while demonstrating practical use of Java collections such as `ArrayList` and `Queue`.

## About the Project

The Library Management System simulates common operations in a small library.

Users can add and manage books, register members and librarians, borrow and return books, reserve unavailable books, calculate late fees, search for books, and display stored information through a simple console menu.

The project also includes **Big-O complexity comments** for many operations and uses **recursion** to count the number of currently available books.

## Features

- Add books
- Add important books at the beginning of the book list
- Register members
- Register librarians
- Automatically generate unique IDs
- Borrow available books
- Return borrowed books
- Reserve unavailable books
- Store reservations using a queue
- Display the next reserved book
- Process the next reservation
- Calculate late fees
- Update books by index
- Remove books by index
- Search for books by ID
- Check whether a book exists
- Find the index of a book
- Display all books
- Display all members
- Display all librarians
- Count available books using recursion
- Clear all books and reservations
- Track whether a book is available or borrowed

## Data Structures Used

### ArrayList

`ArrayList` is used to store:

- Books
- Members
- Librarians

It allows the system to dynamically add, remove, update, search, and access stored objects.

Examples of `ArrayList` operations used in the project include:

- `add()`
- `add(index, element)`
- `get()`
- `set()`
- `remove()`
- `contains()`
- `indexOf()`
- `size()`
- `isEmpty()`
- `clear()`

### Queue

A `Queue<Book>` implemented using `ArrayDeque` is used to manage book reservations.

The reservation queue follows the **FIFO (First In, First Out)** principle.

This means that the first book added to the reservation queue is the first one processed when it becomes available.

Queue operations used include:

- `offer()`
- `peek()`
- `poll()`
- `clear()`

## Main Classes

### `Book`

Represents a book in the library.

Each book contains:

- Unique book ID
- Title
- Author
- Availability status

Book IDs are generated automatically using a static counter.

The class also overrides:

- `equals()`
- `toString()`

### `Member`

Represents a registered library member.

Each member contains:

- Unique member ID
- Name
- Phone number

Member IDs are generated automatically.

### `Librarian`

Represents a librarian working in the library.

Each librarian contains:

- Unique librarian ID
- Name
- Phone number

Librarian IDs are also generated automatically.

### `LibrarySystem`

Contains the main logic of the application.

It manages:

- Books
- Members
- Librarians
- Reservation queue

It is responsible for operations such as:

- Adding books
- Borrowing and returning books
- Reserving books
- Processing reservations
- Searching for books
- Updating and removing books
- Calculating late fees
- Displaying stored information
- Counting available books recursively

### `Main`

Contains the console menu and handles user interaction with the system using `Scanner`.

## Book Reservation System

If a user tries to borrow a book that is currently unavailable, the book is added to the reservation queue.

The system can then:

1. Display the next reserved book.
2. Check whether that book has become available.
3. Remove it from the queue.
4. Mark it as borrowed again.

This demonstrates how a **Queue** can be used to manage requests in the order they were received.

## Late Fee Calculation

The system calculates a simple late-return fee.

The current rule is:

`Late Fee = Number of Late Days × $1`

For example:

- 2 days late → `$2`
- 5 days late → `$5`
- 0 days late → `$0`

## Recursion

The project uses recursion to count the number of available books.

The recursive method checks each book one by one until it reaches the end of the `ArrayList`.

This provides practical practice with:

- Base cases
- Recursive calls
- Traversing a collection recursively

## Big-O Complexity

Many methods in the project include comments describing their time complexity.

Examples:

- Adding a book to the end of an `ArrayList` → `O(1)` average
- Adding an important book at index `0` → `O(n)`
- Searching for a book → `O(n)`
- Removing a book by index → `O(n)`
- Viewing the next reservation in a queue → `O(1)`
- Counting available books recursively → `O(n)`

This project therefore combines practical programming with basic algorithm and complexity analysis.

## Menu Options

The console application provides the following options:

1. Add Book
2. Add Important Book
3. Add Member
4. Add Librarian
5. Borrow Book
6. Return Book
7. Reserve Book
8. Display Next Reserved Book
9. Process Next Reservation
10. Calculate Late Fee
11. Update Book By Index
12. Remove Book By Index
13. Search Book By ID
14. Check Book Exists
15. Display Book Index
16. Display Books
17. Display Members
18. Display Librarians
19. Count Available Books Recursively
20. Clear All Books
0. Exit

## Technologies Used

- Java
- Object-Oriented Programming
- Java Collections Framework
- ArrayList
- Queue
- ArrayDeque
- Recursion
- IntelliJ IDEA

## Java Concepts Practiced

This project demonstrates several Java concepts, including:

- Classes and Objects
- Encapsulation
- Constructors
- Static Variables
- Automatic ID Generation
- Getters and Setters
- Method Overriding
- `equals()`
- `toString()`
- ArrayList
- Queue
- ArrayDeque
- Recursion
- Searching
- Loops and Conditions
- Object References
- Scanner Input
- Big-O Complexity

## Project Structure

Library-Management-System-Java-DS/
│
├── src/
│   ├── Main.java
│   ├── LibrarySystem.java
│   ├── Book.java
│   ├── Member.java
│   └── Librarian.java
│
├── README.md
└── .gitignore

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Open `Main.java`.
4. Run the `main()` method.
5. Use the console menu to interact with the system.

## Project Limitations

- The application runs entirely in the console.
- Data is stored only in memory and is lost when the program closes.
- There is no database connection.
- There is no graphical user interface.
- Reservations are stored as books in a simple queue rather than being associated with individual members.
- The project focuses mainly on practicing Java, OOP, data structures, recursion, and algorithm complexity.

## Purpose

The main purpose of this project is to apply **Java Object-Oriented Programming and Data Structures** to a practical library scenario.

It demonstrates how collections such as `ArrayList` and `Queue` can be used to organize and manage real-world data while also practicing searching, recursion, object management, and Big-O complexity analysis.

## Author

**Ahmad Yassine**

Computer Science Student