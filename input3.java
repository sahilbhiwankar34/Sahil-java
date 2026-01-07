import java.io.*;
class input3 {
    public static void main(String[] args)
    throws Exception 
    {
      InputStreamReader p=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(p);
      String s1,s2,s3;
      System.out.print("Enter first number: ");
      s1=br.readLine();
      System.out.print("Enter the second number: ");
      s2=br.readLine();
      System.out.print("Enter the third number: ");
      s3=br.readLine();
      System.out.println();

      int n1=Integer.parseInt(s1);
      int n2=Integer.parseInt(s2);
      int n3=Integer.parseInt(s3);

      double avg=(n1+n2+n3)/3;
      System.out.println("Average: "+avg);

    }
}
