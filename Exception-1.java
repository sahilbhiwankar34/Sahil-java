import java.util.*;
class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = sc.nextInt();
        int amt = sc.nextInt();
        if (amt > bal)
            System.out.println("Insufficient Balance");
        else {
            bal -= amt;
            System.out.println("Withdrawal successful. Remaining balance: " + bal);
        }
    }
}