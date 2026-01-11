import java.util.Scanner;
public class scanner2 {
    public static void main(String args[]){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the number to check even odd: ");
        int n1=s1.nextInt();
        if(n1%2==0){
            System.out.println(n1+" is even number");
        }
        else{
            System.out.println(n1+" is an odd number");
        }
    }
}
