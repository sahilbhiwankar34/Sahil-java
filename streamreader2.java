import java.io.*;


class streamreader2 {
    public static void main(String[] args) 
    throws Exception
    {
        InputStreamReader ri= new InputStreamReader(System.in);
        BufferedReader bi= new BufferedReader(ri);
        String data="";
        while(!data.equals("stop")){
            System.out.print("Enter data: ");
            data=bi.readLine();
            System.out.println("Data is: "+data);
        }
        bi.close();
        ri.close();
    }
}
