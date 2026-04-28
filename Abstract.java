abstract class Shape{
    abstract double calculate_area();
    
    void displayinfo(){
        System.out.println("Shapes Area");
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }

    @Override double calculate_area(){
        return 3.14*radius*radius;
    }

}

class Rectangle extends Shape{
    double length,breath;
    Rectangle(double length,double breath){
this.length=length;
this.breath=breath;
    }

    @Override double calculate_area(){
        return length*breath;
    }
}

public class Abstract{
    public static void main(String args[]){
        Shape s;

        s=new Circle(20.76);
         s.displayinfo();
        System.out.println("The area of circle is : "+s.calculate_area());

        s=new Rectangle(23.4,67.8);
        System.out.println("The area of Rectangle is: "+s.calculate_area());
    }
}

