import java.util.ArrayList;

// Library class
public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("Book with this ISBN already exists!");
                return;
            }
        }
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\n--- List of All Books in the Library ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isAvailable()) {
                    System.out.println("Sorry, this book is already borrowed.");
                    return;
                }
                book.setAvailable(false);
                System.out.println("You have successfully borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    System.out.println("This book is already available in the library.");
                    return;
                }
                book.setAvailable(true);
                System.out.println("You have successfully returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found.");
    }
}