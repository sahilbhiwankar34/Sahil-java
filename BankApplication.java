class transaction extends Exception{
    transaction(String msg){
        super(msg);
    }
}
public class BankApplication {
    static void processTransaction(boolean status) throws transaction{
        if(status){
            System.out.print("Transaction Processed");
        }
        else{
            throw new transaction("Exception Handled in main");
        }

    }
    public static void main(String[] args) {
        try {
            processTransaction(false);
        } catch ( transaction e) {
            System.out.println(e);
        }
    } 
}
