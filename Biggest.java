import java.util.Scanner;
public class Biggest {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            long num,biggest;
            System.out.print("Enter the number: ");
            num=sc.nextLong();
            biggest=num;
            for(int count=0;count<10;count++){
                System.out.print("Enter the number: ");
                num=sc.nextLong();
                if(num>biggest){
                    biggest=num;
                }
            }
            System.out.println("Biggest value is: "+biggest);
        }
    }
}
