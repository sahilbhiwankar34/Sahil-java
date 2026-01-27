import java.util.Scanner;

public class Evensum {
    public static void main(String[] args) {
        int n,s;
        Scanner input=new Scanner(System.in);
        s=0;
        while (true) { 
            System.out.println("Input an integer: ");
            n=input.nextInt();
            if(n%2==0){
                s=s+n;
                continue;
            }
            else{
                break;
            }
        }
System.out.println("Sum of even no: "+s);
    }
}
