import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,sum=0,count=0;
        System.out.print("Enter an integer: ");
        while((n=s.nextInt())!=0){
            sum+=n;
            count++;
            System.out.print("Input an integer: ");
        }
        float avg=sum/count;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
    }
}
