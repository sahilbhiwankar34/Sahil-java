class sum{
    int a=0;
    void su(int x){
        for(int i=1;i<=x;i++){
            a=a+i;
        }
        System.out.println("The sum of numbers from 1 to"+x+" is: "+a);
    }
}




public class calculate_sum_1_____100 {
    public static void main(String[] args) {
        sum s=new sum();
        s.su(100);
    }
}
