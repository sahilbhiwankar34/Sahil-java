import java.util.Scanner;
public class EmailChecker {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the E-mail: ");
            String email=sc.nextLine();

            if(email.contains("@gmail.com")){
                System.out.println("The Entered E-mail is valid.");
            }

            else{
                System.out.println("The Entered E-mail is not valid");
            }
        }
    }
}
