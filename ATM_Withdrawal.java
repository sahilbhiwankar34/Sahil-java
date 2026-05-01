import java.util.*;
class InvalidInputException extends Exception{
    InvalidInputException(String msg){
        super(msg);
    }
}
public class ATM_Withdrawal{
    public static void main(String[] args) {
       try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Balance: ");
            double amount=sc.nextDouble();

            System.out.print("Enter the Withdrawal Amount: ");
            double withdraw=sc.nextDouble();

            if(withdraw>amount){
                throw new InvalidInputException("Withdrawal Amount is greater than Balance Amount");
            }
            amount=amount-withdraw;
            System.out.println("Total Amount after Withdrwal is: "+amount);
        }
        catch(InvalidInputException e){
         System.out.println(e.getMessage());
        }


        
    }

}