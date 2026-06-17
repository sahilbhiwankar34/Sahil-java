import java.util.Scanner;
public class power5{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int count=0;
            double base,exp,power;
            while(count<5){
                System.out.print("Enter the base: ");
                base=sc.nextDouble();
                System.out.println("Enter the Exponent: ");
                exp=sc.nextDouble();
                power=Math.pow(base,exp);
                System.out.println("Power = "+power);
                System.out.println("********************");
                count++;
            }
        }
    }
}