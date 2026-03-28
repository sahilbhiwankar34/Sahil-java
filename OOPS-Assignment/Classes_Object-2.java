import java.util.*;

class Book {
    String title, author, isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}

class Library {
    ArrayList<Book> list = new ArrayList<>();

    void add(Book b) {
        list.add(b);
    }

    void remove(String isbn) {
        list.removeIf(b -> b.isbn.equals(isbn));
    }

    void display() {
        for (Book b : list)
            System.out.println(b.title + " " + b.author + " " + b.isbn);
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.add(new Book("A", "X", "1"));
        l.add(new Book("B", "Y", "2"));
        l.display();
    }
}