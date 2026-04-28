abstract class Payment{
    abstract void pay(double amount);
}


class CreditCardPayment extends Payment{
    @Override void pay(double amount){
        System.out.println("Discount after Paying through credit card is: "+(amount-1000));
    }
}

class UPIPayment extends Payment{
    @Override void pay(double amount){
        System.out.println("After platform fee charges total Payment is: "+(amount+10));
    }
}

class NetBankingPayment extends Payment{
    @Override void pay(double amount){
        System.out.println("The Total amount is: "+amount);
    }
}


public class Abstract1 {
    public static void main(String[] args) {
        Payment p;

        p=new CreditCardPayment();
        p.pay(25000);

        p=new UPIPayment();
        p.pay(45000);

        p=new NetBankingPayment();
        p.pay(30000);
    }
}
