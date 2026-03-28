abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Credit " + amount);
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("UPI " + amount);
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("NetBanking " + amount);
    }
}