abstract class Employee1 {
    String name;
    int id;
    abstract double calculateBonus();
}

class Manager extends Employee1 {
    double salary;
    Manager(double s) { salary = s; }
    double calculateBonus() { return 0.2 * salary; }
}

class Developer extends Employee1 {
    double salary, incentive;
    Developer(double s, double i) { salary = s; incentive = i; }
    double calculateBonus() { return 0.1 * salary + incentive; }
}