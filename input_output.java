import java.util.Scanner;
public class input_output {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.next();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        System.out.print("Enter your fee: ");
        double fee=sc.nextDouble();

        System.out.println("Rollno of "+name+" is "+age+" and paid fee: "+fee);

    }
}
