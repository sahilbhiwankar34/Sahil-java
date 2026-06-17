import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number of terms: ");
            int n=sc.nextInt();
        int i=1,j=1,count=2,sum=i+j;
        System.out.print("Fibonacci Series: "+i+ " "+j+" ");
        while(count<n){
            System.out.print(sum+" ");
            i=j;
            j=sum;
            sum=i+j;
            count++;
        }
    }
}
}
