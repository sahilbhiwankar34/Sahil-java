import java.util.*;
class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.equals(b))
            System.out.println("Same (case-sensitive)");
        else
            System.out.println("Different (case-sensitive)");

        if (a.equalsIgnoreCase(b))
            System.out.println("Same (case-insensitive)");
        else
            System.out.println("Different (case-insensitive)");
    }
}