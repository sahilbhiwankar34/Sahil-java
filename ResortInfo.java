import java.util.Scanner;
class Resort{
    int regno;
    String name;
    double charges;
    int days;
double result;
void getinfo(int regno,String name,double charges,int days){
    this.regno=regno;
    this.name=name;
    this.charges=charges;
    this.days=days;
}

void compute(){
    if(days*charges>=11000){
        result=1.02*(days*charges);
    }

    else{
        result=days*charges;

    }
}

void DispInfo(){
    System.out.println("Registration Number: "+regno);
    System.out.println("Name of Customer: "+name);
    System.out.println("Charges of per days: "+charges);
    System.out.println("Days of Stay: "+days);
    System.out.println("Total Amount: "+result);

}
}

public class ResortInfo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                Resort r=new Resort();
                System.out.print("Enter the number of days (0 to exit): ");
                int rd=sc.nextInt();
                sc.nextLine();
                if(rd==0){
                    break;
                }
                System.out.print("Enter the registration number: ");
                int rn=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Name of customer: ");
                String rs=sc.nextLine();
                System.out.print("Enter the Charges per day: ");
                double rc=sc.nextDouble();
                
                r.getinfo(rn, rs, rc, rd);
                r.compute();
                r.DispInfo();
            }
        }

        }
    }

