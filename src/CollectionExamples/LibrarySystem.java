package CollectionExamples;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public boolean isIssued() { return isIssued; }
    public void setIssued(boolean issued) { this.isIssued = issued; }

    @Override
    public String toString() {
        String status = isIssued ? "Issued " : "Available ";
        return "ID: " + id + " | Title: \"" + title + "\" | Author: " + author + " | Status: " + status;
    }
}

public class LibrarySystem {
    private static ArrayList<Book> library = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        library.add(new Book(1, "Gunaho ka devta", "Dharamvir Bharti"));
        library.add(new Book(2, "Effective Java", "Joshua Bloch"));
        library.add(new Book(3, "The Metamorphosis", "Franz Kafka"));

        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Issue a Book");
            System.out.println("6. Return a Book");
            System.out.println("7. Delete a Book");
            System.out.println("8. Display Available Books");
            System.out.println("9. Display Issued Books");
            System.out.println("10. Count Total Books");
            System.out.println("11. Exit");
            System.out.print("Select an operation (1-11): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> displayAllBooks();
                case 3 -> searchByTitle();
                case 4 -> searchByAuthor();
                case 5 -> issueBook();
                case 6 -> returnBook();
                case 7 -> deleteBook();
                case 8 -> displayAvailableBooks();
                case 9 -> displayIssuedBooks();
                case 10 -> countTotalBooks();
                case 11 -> {
                    System.out.println("Closing library application. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid entry! Choose an option between 1 and 11.");
            }
        }
    }

    // 1. Add Book
    private static void addBook() {
        System.out.print("Enter Unique Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (findBookById(id) != null) {
            System.out.println("Error: A book with ID " + id + " already exists.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();

        library.add(new Book(id, title, author));
        System.out.println("Book successfully catalogued!");
    }

    // 2. Display All Books
    private static void displayAllBooks() {
        if (library.isEmpty()) {
            System.out.println("The library inventory is empty.");
            return;
        }
        for (Book book : library) {
            System.out.println(book);
        }
    }

    // 3. Search Book by Title
    private static void searchByTitle() {
        System.out.print("Enter title keyword to search: ");
        String searchTitle = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Book book : library) {
            if (book.getTitle().toLowerCase().contains(searchTitle)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("No matching book title found.");
    }

    // 4. Search by Author
    private static void searchByAuthor() {
        System.out.print("Enter author name keyword to search: ");
        String searchAuthor = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Book book : library) {
            if (book.getAuthor().toLowerCase().contains(searchAuthor)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("No books found by that author.");
    }

    // 5. Issue a Book
    private static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = scanner.nextInt();
        Book book = findBookById(id);

        if (book == null) {
            System.out.println("Book not found in system.");
        } else if (book.isIssued()) {
            System.out.println("Sorry, this book is already checked out (issued).");
        } else {
            book.setIssued(true); // Toggles state using setter
            System.out.println("Success! \"" + book.getTitle() + "\" has been issued.");
        }
    }

    // 6. Return a Book
    private static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = scanner.nextInt();
        Book book = findBookById(id);

        if (book == null) {
            System.out.println("Book records not found.");
        } else if (!book.isIssued()) {
            System.out.println("This book is already sitting in the library shelf (not issued).");
        } else {
            book.setIssued(false); // Restores status
            System.out.println("Success! \"" + book.getTitle() + "\" returned back to the library.");
        }
    }

    // 7. Delete a Book
    private static void deleteBook() {
        System.out.print("Enter Book ID to delete from registry: ");
        int id = scanner.nextInt();
        Book book = findBookById(id);

        if (book != null) {
            library.remove(book); // Uses ArrayList remove(Object o)
            System.out.println("Book successfully deleted from registry.");
        } else {
            System.out.println("Book not found. Deletion failed.");
        }
    }

    // 8. Display Available Books
    private static void displayAvailableBooks() {
        boolean availableFound = false;
        for (Book book : library) {
            if (!book.isIssued()) {
                System.out.println(book);
                availableFound = true;
            }
        }
        if (!availableFound) System.out.println("No books are currently available to borrow.");
    }

    // 9. Display Issued Books
    private static void displayIssuedBooks() {
        boolean issuedFound = false;
        for (Book book : library) {
            if (book.isIssued()) {
                System.out.println(book);
                issuedFound = true;
            }
        }
        if (!issuedFound) System.out.println("There are no currently checked-out / issued books.");
    }

    // 10. Count Total Books
    private static void countTotalBooks() {
        System.out.println("Total catalogued collection size: " + library.size() + " books.");
    }

    // Helper Utility method to locate a book inside our list
    private static Book findBookById(int id) {
        for (Book book : library) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}