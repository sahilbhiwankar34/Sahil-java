import java.util.*;
class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = s.lastIndexOf('.');
        System.out.println(s.substring(i + 1));
    }
}