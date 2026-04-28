class shape{
    void display(){
        System.out.println("Shapes Area");
    }
}

class Circle extends shape{
    double a;

    void Calarea(double area){
       a=3.14*area*area;
    }

    void displayarea(){
        System.out.println("The are aof circle is: "+a);
    }
}

class Rectangle extends shape{
    double ae;

    void calarea(double length,double breath){
        ae=length*breath;
    }
    void displayarea(){
        System.out.println("Area of rectangle is: "+ae);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.display();
        c.Calarea(23.456);
        c.displayarea();


        Rectangle r=new Rectangle();
        r.display();
        r.calarea(23, 34.56);
        r.displayarea();
    }
}
