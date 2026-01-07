import java.io.*;

public class input4 {
    public static void main(String[] args) 
    throws Exception {
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(i);
        String n1,n2,n3;
        System.out.print("Enter the first number: ");
        n1=b.readLine();
        System.out.print("Enter the second number: ");
        n2=b.readLine();
        System.out.print("Enter the third number: ");
        n3=b.readLine();

        float num1= Float.parseFloat(n1);
        float num2=Float.parseFloat(n2);
        float num3=Float.parseFloat(n3);

        double a=(num1+num2+num3)/3.0;
        System.out.println("Average: "+a);
    }
}
