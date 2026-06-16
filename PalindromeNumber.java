import java.util.Scanner;
class PalindromeNumber{
 public static void main(String[] args) {
     try(Scanner sc=new Scanner(System.in)){
        int n,num;
        int rev=0,r;
        System.out.print("Enter the number to check: ");
        n=sc.nextInt();
        num=n;
        while(num!=0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;

        }
        if(n==rev){
            System.out.println("Number is palindrome");
        }
        else
            {
            System.out.println("Numnber is not palindrome");
        }

     }
 }
}