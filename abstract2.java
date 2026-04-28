abstract class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;

    }

    abstract void calculateBonus();

    void display(){
        System.out.println("Employee Bonus");
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);



    }
}

class Manager extends Employee{
 Manager(String name,int id,double salary){
        super(name,id,salary);
    }
    @Override void calculateBonus(){
    double Bonus=super.salary*0.20;
    super.display();
    System.out.println("Total Bonus is: "+Bonus);
}
}

class Developer extends Employee{

    Developer(String name,int id,double salary){
        super(name,id,salary);
    }
    @Override void calculateBonus(){
        double Bonus=(super.salary*0.10)+1000;
        super.display();
        System.out.println("Total Bonus is: "+Bonus);
    }
}
public class abstract2 {
    public static void main(String[] args) {
        Employee e;
       
        e=new Manager("Sahil",101,230000.0);
        e.calculateBonus();

        e=new Developer("Rahul",1033,34000.0);
        e.calculateBonus();
    }
}
