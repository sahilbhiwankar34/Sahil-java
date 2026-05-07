import java.util.Scanner;
class EvenOddException extends Exception{

    public EvenOddException(String message) {
        super(message);
    }
    
}
public class UserException {
public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();

        if(n%2!=0){
            throw new EvenOddException("The number is not even");
        }

        System.out.println("The number is even");


    } catch ( EvenOddException e) {
        System.out.println(e.getMessage());
    }
}    
}
