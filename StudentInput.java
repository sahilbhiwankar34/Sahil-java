import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentInput {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the age");
            int age=sc.nextInt();

            System.out.println("Student age: "+age);

        }
        catch(ArithmeticException | InputMismatchException e){
            System.out.println("Invalid Input");
        }
    }
}
