import java.util.*;

class LibrarySystem {

    class Book {
        String title;
        String author;
        String isbn;
        boolean available;

        Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.available = true;
        }
    }

    private Map<String, Book> books = new HashMap<>();

    public void add_book(String title, String author, String isbn) {
        books.put(isbn, new Book(title, author, isbn));
    }

    public boolean checkout(String isbn, String member_id) {
        Book book = books.get(isbn);

        if (book == null || !book.available) {
            return false;
        }

        book.available = false;
        return true;
    }

    public boolean return_book(String isbn) {
        Book book = books.get(isbn);

        if (book == null || book.available) {
            return false;
        }

        book.available = true;
        return true;
    }

    public List<Book> get_available_books() {
        List<Book> result = new ArrayList<>();

        for (Book book : books.values()) {
            if (book.available) {
                result.add(book);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        library.add_book("Clean Code", "Robert Martin", "123");

        System.out.println(library.checkout("123", "M001")); // true
        System.out.println(library.checkout("123", "M002")); // false
        System.out.println(library.return_book("123")); // true
    }
}