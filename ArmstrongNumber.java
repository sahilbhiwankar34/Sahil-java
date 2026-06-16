import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        long num,num1,sum=0;
        int r;
        try(Scanner sc=new Scanner(System.in)){
            num=sc.nextLong();
            num1=num;
            while(num1!=0){
                r=(int) (num1%10);
                sum=sum+(r*r*r);
                num1=num1/10;
            }
            if(sum==num){
                System.out.println("Number is an armstrong number");
            }
            else{
                System.out.println("Number is not an armstrong number");
            }
        }
    }
}
