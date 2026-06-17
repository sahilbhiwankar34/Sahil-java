import java.util.Scanner;
public class primenumber{
public static void main(String args[]){
try(Scanner sc=new Scanner(System.in)){
    int num,i,div=2;
    System.out.print("Enter a number: ");
    num=sc.nextInt();
    i=(int) Math.sqrt(num);
    while(div<=i){
        if(num%div==0){
            System.out.println("Number is not prime");
            break;
        }
    
        ++div;
            }        
            if(div>i){
                System.out.println("Number is prime");
            }
    
}
}
}