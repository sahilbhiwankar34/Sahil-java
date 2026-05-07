import java.util.Arrays;
//import java.util.Scanner;
public class Alphabetical {
    public static void main(String args[]){
       // try(Scanner sc=new Scanner(System.in)){
            //System.out.println("Enter the String: ");
            //String s=sc.nextLine();

           /*  char [] chars=s.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);
            System.out.println("String in alphabetical order is: "+sorted);
*/
        String [] cities={"Mumbai","Chennai","Amravati","Nagpur","Kolkata"};
        Arrays.sort(cities);

            for (String citie : cities) {
                System.out.println(citie);
            }

        }
    }
