class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    public String toString() {
        return id + " " + name;
    }

    public static void main(String[] args) {
        Student s = new Student(1, "A");
        System.out.println(s);
    }
}