import java.util.*;

class Book {
    int id;
    String title;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
}

public class Main {
    private static Map<Integer, Book> books = new HashMap<>();
    private static int idCounter = 1;

    public static void addBook(String title) {
        books.put(idCounter, new Book(idCounter, title));
        System.out.println("Book added: " + title + " (id=" + idCounter + ")");
        idCounter++;
    }

    public static void listBooks() {
        for (Book b : books.values()) {
            System.out.println("ID: " + b.id + ", Title: " + b.title);
        }
    }

    public static void getBook(int id) {
        Book b = books.get(id);
        if (b != null) {
            System.out.println("ID: " + b.id + ", Title: " + b.title);
        } else {
            System.out.println("Book not found!");
        }
    }

    public static void deleteBook(int id) {
        if (books.remove(id) != null) {
            System.out.println("Book deleted: id=" + id);
        } else {
            System.out.println("Book not found!");
        }
    }

    public static void main(String[] args) {
        addBook("Java Programming");
        addBook("Clean Code");
        listBooks();
        getBook(1);
        deleteBook(2);
        listBooks();
    }
}
// Minor change for pull request hhgff
