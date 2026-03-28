class Shape1 {
    void display() {
        System.out.println("Shape");
    }
}

class Circle1 extends Shape1 {
    void area() {
        System.out.println(3.14 * 2 * 2);
    }
}

class Rectangle1 extends Shape1 {
    void area() {
        System.out.println(2 * 3);
    }
}