class Resort {
    int Rno, Days;
    String Name;
    double Charges;

    double Compute() {
        double amt = Days * Charges;
        if (amt > 11000) amt = 1.02 * amt;
        return amt;
    }

    void Getinfo(int r, String n, double c, int d) {
        Rno = r;
        Name = n;
        Charges = c;
        Days = d;
    }

    void DispInfo() {
        System.out.println(Rno + " " + Name + " " + Charges + " " + Days + " " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo(1, "A", 2000, 6);
        r.DispInfo();
    }
}