import java.util.Scanner;
public class FileExtensionExtractor {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the File Name: ");
            String file=sc.nextLine();

            int index=file.lastIndexOf(".");

            if(index !=-1 && index != file.length()-1){
                String extension=file.substring(index+1);
                System.out.println("File Extension: "+extension);
            }
            else{
                System.out.println("No valid Extension found");
            }
        }
    }
}
