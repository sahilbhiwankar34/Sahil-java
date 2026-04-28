import java.util.Scanner;
class Employee{
    int empno;
    String empname;
    double  basic,hr,da,netpay;
     
    void havedata(int empno,String empname,double basic,double hr,double da){
        this.empno=empno;
        this.empname=empname;
        this.basic=basic;
        this.hr=hr;
        this.da=da;
    

    }

    void calculate(){
        netpay=basic+da+hr;
    }

    void display(){
        System.out.println("*******************");
        System.out.println("The Employee Number is:  "+empno);
        System.out.println("The Employee Name is : "+empname);
        System.out.println("Netpay of Employee is : "+netpay);
        
        System.out.println("*******************");
    }
}

public class EmployeeInfo{
    public static void main(String[] args) {
       try( Scanner sc=new Scanner(System.in)){
       
        System.out.print("Enter the number of Employee to enter their data: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
 Employee e=new Employee();
            System.out.print("Enter the Employee Number: ");
            int en=sc.nextInt();
            sc.nextLine();

             System.out.print("Enter the Employee Name: ");
             String ena=sc.nextLine();

              System.out.print("Enter the Basic of Employee: ");
              double b=sc.nextDouble();

              System.out.print("Enter the DA of Employee: ");
              double d=sc.nextDouble();

              System.out.print("Enter the HR of Employee: ");
              double h=sc.nextDouble();

              e.havedata(en, ena, b , h, d);

              e.calculate();

              e.display();
        }
        sc.close();
    }
}
}