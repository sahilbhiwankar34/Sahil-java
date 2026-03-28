class Staff {
    void work() { System.out.println("Staff"); }
}

class Doctor extends Staff {
    void work() { System.out.println("Treat"); }
}

class Nurse extends Staff {
    void work() { System.out.println("Assist"); }
}

class Receptionist extends Staff {
    void work() { System.out.println("Manage"); }
}