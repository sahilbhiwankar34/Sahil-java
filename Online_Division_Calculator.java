import java.util.Scanner;
public class Online_Division_Calculator {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter value of Two Integers: ");
            int a=sc.nextInt();
            int b=sc.nextInt();

            if(b==0){
                throw new ArithmeticException("Cannot divide by zero");
            }
            float c=(float)a/b;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
