class Person1 {
    void role() { System.out.println("Person"); }
}

class Employee2 extends Person1 {
    void role() { System.out.println("Employee"); }
}

class Manager2 extends Employee2 {
    void role() { System.out.println("Manager"); }
}