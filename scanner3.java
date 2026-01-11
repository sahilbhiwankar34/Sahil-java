import java.util.Scanner;
class scanner3{
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n2=sc1.nextInt();
        int flag=0;
        if(n2==0 || n2==1){
            flag=1;
        }
        for(int i=2;i<=n2/2;i++){
            if(n2%i==0){
                flag=1;
                break;

            }
        }
        if(flag==0){
            System.out.println("The number is prime");

        }
        else{
            System.out.println("The number is not prime");
        }
    }
}
