class Bank{
    void getAmount(double amount){
       try {
           if(amount<=0){
            throw new Exception("Exception Handeled by main");
           }
           System.out.println("Balance udated successfully");
       } catch (Exception e) {

       System.out.println("Exception handles by main");

        }
    }
}
class BalanceData{
    public static void main(String[] args) {
        Bank b=new Bank();
        b.getAmount(2000);
    }
}