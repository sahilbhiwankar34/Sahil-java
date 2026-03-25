class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("A", 20);
        Person p2 = new Person("B", 25);
        p1.display();
        p2.display();
    }
}