import java.util.Scanner;

// LibraryMain class
public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("A. Add Book");
            System.out.println("B. View Books");
            System.out.println("C. Borrow Book");
            System.out.println("D. Return Book");
            System.out.println("E. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 'A': {
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
                }
                case 'B': {
                    library.viewBooks();
                    break;
                }
                case 'C': {
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String isbn = scanner.nextLine();
                    library.borrowBook(isbn);
                    break;
                }
                case 'D': {
                    System.out.print("Enter ISBN of the book to return: ");
                    String isbn = scanner.nextLine();
                    library.returnBook(isbn);
                    break;
                }
                case 'E': {
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (choice != 'E');

        scanner.close();
    }
}