import java.io.*;
public class areacircuminput {
   public static void main(String[] args) 
   throws Exception
   {
       InputStreamReader r3=new InputStreamReader(System.in);
       BufferedReader b3=new BufferedReader(r3);
       String radius;
       System.out.println("Enter the radius of circle: ");
       radius=b3.readLine();

       float r=Float.parseFloat(radius);
       double area=3.14*r*r;
       double circum=2*3.142*r;
       System.out.println("Area of circle is: "+area);
       System.out.println("Circumference of circle: "+circum);
   } 
}
