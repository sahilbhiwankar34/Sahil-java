class Book1 {
    String title, author;
    double price;

    Book1(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Book1[] b = {
            new Book1("A","X",100),
            new Book1("B","Y",200)
        };
        for (Book1 x : b) x.display();
    }
}