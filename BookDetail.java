import java.util.ArrayList;

class Book{
String title,author,isbn;
Book(String title,String author,String isbn){
    this.title=title;
    this.author=author;
    this.isbn=isbn;
}
}
class Library{
    ArrayList<Book> list=new ArrayList<>();

    void add(Book b){
        list.add(b);
    }

    void delete(String isbn){
        list.removeIf(b -> b.isbn.equals(isbn));
    }

    void display(){
        for(Book b : list){
            System.out.println("Title: "+b.title);
            System.out.println("Author: "+b.author);
            System.out.println("ISBN: "+b.isbn);
        }
    }
}


public class BookDetail {
    public static void main(String[] args) {
        Library l=new Library();
        l.add(new Book ("moon","sahil","234"));
        l.add(new Book ("sun","sahil","342"));
      
        l.delete("234");
        l.display();
        

    }
}
