class primechecker extends Thread{
    int num;
    primechecker(int n){
        num=n;
    }

    @Override public void run(){
        int flag=0;
        if(num<=1){
            flag=1;
        }

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("The Number is prime");
        }
        else{
            System.out.println("The number is not prime");

        }
    }
}

class primeprinter extends Thread{
@Override public void run(){
    System.out.println("Prime number between 1 to 100: ");
    for(int i=1;i<=100;i++){
        int flag=0;
        for(int j=1;j<=i/2;j++){
            if(i%j==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.print(i+" ");
            
        }
        i=i+1;
    }
}
}




public class Prime {
    public static void main(String[] args) {
        primechecker pc=new primechecker(8);
        primeprinter pp=new primeprinter();

        pc.start();
        pp.start();
    }
}
