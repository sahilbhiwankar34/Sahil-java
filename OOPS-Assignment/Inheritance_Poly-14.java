class Employee3 {
    String name;
    double salary;

    Employee3(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        Employee3 e = new Employee3("A", 5000);
        e.display();
    }
}