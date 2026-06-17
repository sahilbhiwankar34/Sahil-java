
import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            long num,smallest;
            System.out.print("Enter the number: ");
            num=sc.nextLong();
            smallest=num;
            for(int count=0;count<10;count++){
                System.out.print("Enter the number: ");
                num=sc.nextLong();
                if(num<smallest){
                    smallest=num;
                }
            }
            System.out.println("Smallest value is: "+smallest);
        }
    }
}
