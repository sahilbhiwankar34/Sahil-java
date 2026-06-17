import java.util.Scanner;
public class SquarerootRange {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Starting number: ");
            int start_no=sc.nextInt();
            System.out.print("Enter the Last Number: ");
            int last_no=sc.nextInt();

            while(start_no<=last_no){
                float s=(float)Math.sqrt(start_no);
                System.out.println("The square root of "+start_no+" is: "+s);
                start_no++;
            }
        }
    }
}
