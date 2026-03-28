class Bank1 {
    final double rate = 5.0;

    double calculateInterest(double amount) {
        return amount * rate / 100;
    }

    public static void main(String[] args) {
        Bank1 b = new Bank1();
        System.out.println(b.calculateInterest(1000));
    }
}