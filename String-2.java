import java.util.*;
class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains("@gmail.com"))
            System.out.println("Valid Gmail Address");
        else
            System.out.println("Invalid Email");
    }
}