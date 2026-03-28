import java.util.*;
class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        int n = p.length();
        String mask = "";
        for (int i = 0; i < n - 2; i++) mask += "*";
        System.out.println(mask + p.substring(n - 2));
    }
}