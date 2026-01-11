import java.io.*;
public class name_console {
    public static void main(String[] args)
    throws Exception
     {
        Console c=System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome "+n);
    }
}
