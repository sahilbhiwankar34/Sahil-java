class Box{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.println("The volume is: ");
        System.out.println(width*height*depth);
    }
}

public class class1 {
   public static void main(String[] args) {
       Box box1=new Box();
       Box box2=new Box();

       box1.width=10;
       box1.height=10;
       box1.depth=10;

       box2.width=20;
       box2.height=20;
       box2.depth=20;

       box1.volume();
       box2.volume();
   }    
}
