import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the sentence: ");
            String sentence=sc.nextLine();

            StringTokenizer st=new StringTokenizer(sentence);
            int count=st.countTokens();
            System.out.println("Total Words are: "+count);

        }
    }
}
