
import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string to check a palindrome: ");
        String s=sc.nextLine();
        String a=new StringBuilder(s).reverse().toString();
        if(s.equals(a)){
            System.out.println(s+" is a palindrome");
        }
        else{

            System.out.println(s+" is not a palindrome");
        }
       
sc.close();
    }

}