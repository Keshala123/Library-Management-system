# 📚 Library Management System (Java Console App)

This is a simple **Library Management System** built using Java. The application demonstrates the use of **Object-Oriented Programming (OOP)** principles such as classes, objects, and encapsulation. It runs on the console and provides basic functionalities to manage a library's book inventory.

## 🚀 Features

- ✅ **Add Book** – Add new books to the library including title, author, and ISBN.
- 📖 **View Books** – Display a list of all books in the library with availability status.
- 📚 **Borrow Book** – Borrow a book by entering its ISBN. Marks the book as unavailable.
- 🔄 **Return Book** – Return a previously borrowed book. Marks it as available again.
- 🔍 **Check Availability** – Ensures borrowed books are marked unavailable and returned books are marked available.

## 🧱 Tech Stack

- **Java**
- **OOP Concepts**
  - Classes & Objects
  - Encapsulation
  - Basic conditionals & loops

## 💡 How It Works

The program provides a console-based menu with the following options:

A. Add Book B. View Books C. Borrow Book D. Return Book E. Exit

Users can perform actions by selecting the corresponding letter. The system uses a `Book` class to represents each book, and a `Library` class to manage the collection and operations.

## 📂 Project Structure

LibraryMain.java → Main class to run the application Library.java → Handles book inventory and operations (add, borrow, return) Book.java → Represents book entity with title, author, ISBN, and availability


## 🧪 Example

```bash
--- Library Management System ---
A. Add Book
B. View Books
C. Borrow Book
D. Return Book
E. Exit
Enter your choice: A
Enter Book Title: Clean Code
Enter Author Name: Robert C. Martin
Enter ISBN: 12345
Book added successfully!

## Screenshot
![image](https://github.com/user-attachments/assets/af896a2c-fc1b-43f6-9856-7a6ba6c54e1a)


📌 Note
This project is ideal for beginners looking to understand OOP principles in Java through practical implementation. It's a basic version and can be extended with features like user login, due dates, or file/database storage in the future.

🛠️ Future Improvements (Suggestions)

Add persistent storage using files or a database

Implement user authentication

Add fine calculation for late returns

GUI version using JavaFX or Swing
