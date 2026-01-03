public class Employee {
    int empno;
    String name,dept;
    double basicpay;
    void Insertinfo(int e,String n,String d,double b){
        empno=e;
        name=n;
        dept=d;
        basicpay=b;
    }
    void Displayrecord(){
        System.out.println(empno+"\t"+name+"\t"+dept+"\t"+basicpay);
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
System.out.println("Empno\tName\tDepartment\tBasicpay");
        e1.Insertinfo(1,"Sahil" , "Manager", 200000.00);
         e2.Insertinfo(2,"Aditya" , "Manager", 160000.00);
          e3.Insertinfo(3,"Tanishq" , "Clerk", 150000.00);

          e1.Displayrecord();
          e2.Displayrecord();
          e3.Displayrecord();
    }
}
