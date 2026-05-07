
public class StringReplaceall{
    public static void main(String args[]){
       
           
            String s = "The quick brown fox jumps over the lazy dog.";
            String s1=s.replaceAll("fox", "cat").replaceAll("lazy", "energetic");
            System.out.println(s1);

        }
    }
