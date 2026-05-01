import java.util.Scanner;
public class TextEditorBuffer {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the String: ");
            String s=sc.nextLine();

            StringBuilder sb=new StringBuilder(s);

            System.out.println("Enter the String to append: ");
            String s1=sc.nextLine();

            System.out.println("String after Append is :"+sb.append(s1));

            System.out.println("Enter the String and index to insert: ");
            String s2=sc.nextLine();
            int n=sc.nextInt();
            
            

            System.out.println("String after Insertion is : "+sb.insert(n,s2));

            System.out.println("The reverse String is: "+sb.reverse());
        }

    }
}
