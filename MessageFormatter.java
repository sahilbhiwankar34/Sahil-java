import java.util.Scanner;
public class MessageFormatter {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the First Name: ");
            String first=sc.nextLine();

             System.out.println("Enter the Second Name: ");
            String second=sc.nextLine();

            System.out.println("Full Name = "+first+" "+second);



        }
    }
}
