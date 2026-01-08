import java.io.*;
public class prime {
    public static void main(String[] args) 
    throws Exception
    {
        InputStreamReader r6=new InputStreamReader(System.in);
        BufferedReader b6=new BufferedReader(r6);
        String n;
        System.out.println("Enter the number to check prime or not: ");
        n=b6.readLine();
        int m=Integer.parseInt(n);

        int flag=0;

        if(m==1 || m==0){
            flag=1;

        }
        for(int i=2;i<=m/2;i++){
            if(m%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(m+" is an prime number");
        }
        else{
            System.out.println(m+" is not a prime number");
        }

    }
}
