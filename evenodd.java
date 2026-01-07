import java.io.*;
public class evenodd{
    public static void main(String[] args) 
    throws Exception
    {
        InputStreamReader re=new InputStreamReader(System.in);
        BufferedReader bru=new BufferedReader(re);
        String n;
        System.out.print("Enter the number: ");
        n=bru.readLine();
        int n1=Integer.parseInt(n);
        
        if(n1%2==0){
            System.out.println(n1+" is even");
        }
        else{
            System.out.println(n1+" is odd");
        }
    }
}

