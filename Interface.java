interface Area{
    void Calculate();
}

class Rectangle implements Area{
    
    int l,b;
     Rectangle(int length,int breath){
    l=length;
    b=breath;
    }
    @Override public void Calculate(){
    System.out.println("Area of Rectangle is: "+ (l*b));
    }

    }

    class Circle implements Area{
       int r;
        Circle(int radius){
            r=radius;
        }

        @Override public void Calculate(){
            System.out.println("The Area of Circle is: "+ (3.142*r*r));
        }
    }

    class Triangle implements Area{
        int b1,h;
        Triangle(int base,int height){
            b1=base;
            h=height;
        }
        @Override public void Calculate(){
            System.out.println("The area of triangle is "+(0.5*b1*h));
        }
    }


public class Interface {
 public static void main(String[] args) {

    Area a;
    a=new Rectangle(34,56);
    a.Calculate();

    a=new Circle(34);
    a.Calculate();

    a=new Triangle(5,10);
    a.Calculate();
    
}
}
