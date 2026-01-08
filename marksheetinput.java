import java.io.*;

public class marksheetinput {
    public static void main(String[] args)
    throws Exception
     {
        InputStreamReader r4=new InputStreamReader(System.in);
        BufferedReader b4=new BufferedReader(r4);
        String m1,m2,m3;
        System.out.print("Enter the marks of first subject: ");
        m1=b4.readLine();
        System.out.print("Enter the marks of second subject: ");
        m2=b4.readLine();
        System.out.print("Enter the marks of third subject: ");
        m3=b4.readLine();

        int ma1=Integer.parseInt(m1);
        int ma2=Integer.parseInt(m2);
        int ma3=Integer.parseInt(m3);

        int sum=ma1+ma2+ma3;
        float per= sum/3;
        System.out.println("Total Marks: "+sum);
        System.out.println("Percentage: "+per);

    }
}
