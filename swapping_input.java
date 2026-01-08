import java.io.*;
public class swapping_input {
    public static void main(String[] args)
    throws Exception 
    {
      InputStreamReader r5= new InputStreamReader(System.in);
      BufferedReader b5=new BufferedReader(r5);
      String s1,s2;
      System.out.println("Enter the first number: ");
      s1=b5.readLine();  
      System.out.println("Enter the second number: ");
      s2=b5.readLine();  

      int n1=Integer.parseInt(s1);
      int n2=Integer.parseInt(s2);

      int temp;
      temp=n1;
      n1=n2;
      n2=temp;
      System.out.println("After swapping The numbers are: "+n1+" "+n2);
    }
}
