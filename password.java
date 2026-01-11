// import java.io.*;
// public class password {
//     public static void main(String args[])
//     throws Exception
//     {
//        Console c=System.console();
//        System.out.print("Enter password: ");
//        char[] ch=c.readPassword();
//        System.out.print("Password is: ");
//        for(char ch2:ch)
//         System.out.print(ch2);
//     }
// }
import java.util.*;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();
        System.out.println("Password is: " + pwd);
    }
}
