import java.io.*;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
class pi{
    public static void main(String[] args)
throws Exception
{
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);
    System.out.println("Enter the string: ");
    String name=br.readLine();
    System.out.println("Welcome "+name);

}
}