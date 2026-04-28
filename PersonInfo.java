class Person{
     String name;
     int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println();
    }
}

public class PersonInfo{
    public static void main(String args[]){
        Person p=new Person("Sahil", 20);
        p.displayInfo();

        Person p1=new Person("Rahul", 20);
        p1.displayInfo();
    }
}
