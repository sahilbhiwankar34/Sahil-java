class Person{
    void role(){
        System.out.println("Persons role is too be respectful");
    }
}

class Employee extends Person{
    @Override void role(){
        System.out.println("Employee role is to be good in their job");
    }
}

class Manager extends Employee{
    @Override void role(){
        System.out.println("Manager Role is too manage Department");
    }
}



public class Multilevel {
    public static void main(String[] args) {
        Person m;
        m=new Manager();
        m.role();

        m=new Employee();
        m.role();
        
        
        m=new Person();
        m.role();
    }
}
