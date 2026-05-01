import java.util.Scanner;
public class Student_name_Comparison {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Student 1 name: ");
            String s1=sc.nextLine();
            System.out.println("Enter the Student 2 name: ");
            String s2=sc.nextLine();

            if(s1.equals(s2)){
                System.out.println("Names are Equal(Case Sensitive)");
            }
            else{
                System.out.println("Names are not Equal(Case Sensitive)");
            }


            if(s1.equalsIgnoreCase(s2)){
                System.out.println("Names are Equal(Case Insensitive)");
            }

            else{
                 System.out.println("Names are Equal(Case Insensitive)");
            }


        }
    }
}
