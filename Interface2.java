interface Bank{
    double getinterestrate(double r);
}

class SBI implements Bank{
@Override public double getinterestrate(double rate){
     return rate;
}
}

class HDFC implements Bank{
    @Override public double getinterestrate(double rate){
        return rate;
    }
}

class ICICI implements Bank{
    @Override public double getinterestrate(double rate){
        return rate;
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Bank b;

        b=new SBI();
        System.out.println("The rate of SBI Bank is: "+b.getinterestrate(4567));

        b=new HDFC();
        System.out.println("The rate of HDFC Bank is: "+b.getinterestrate(20000.989));

        b=new ICICI();
        System.out.println("The rate of ICICI Bank is: "+b.getinterestrate(434555.55));
    
    }
}
