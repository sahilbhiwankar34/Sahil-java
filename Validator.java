import java.util.Scanner;
public class Validator {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        String s1=s.trim();
        String s2=s1.toLowerCase();
        System.out.println("Username: "+s2);



    }
}
}
