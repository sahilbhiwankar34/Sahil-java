class NumberException extends Exception{

    public NumberException(String message) {
        super(message);
    }
    
}

public class NumberValidity {
    
    void compute(int n) throws NumberException{
        if(n>10){
            throw new NumberException("The number is gretaer than 10");
        }
        System.out.println("The number is: "+n);
    }

    public static void main(String args[]){
        try {
            NumberValidity nv=new NumberValidity();
            nv.compute(12);
        } catch (NumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
