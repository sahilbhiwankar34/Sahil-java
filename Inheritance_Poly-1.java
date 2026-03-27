abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) { this.r = r; }

    double calculate_area() {
        return 3.14 * r * r;
    }
}

class Rectangle2 extends Shape {
    double l, b;

    Rectangle2(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double calculate_area() {
        return l * b;
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(2);
        Shape s2 = new Rectangle2(2, 3);
        s1.display_info();
        System.out.println(s1.calculate_area());
        System.out.println(s2.calculate_area());
    }
}