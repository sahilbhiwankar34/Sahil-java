class employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata(int no, String name, float b, float h, float d) {
        empno = no;
        ename = name;
        basic = b;
        hra = h;
        da = d;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + netpay);
    }

    public static void main(String[] args) {
        employee e = new employee();
        e.havedata(1, "A", 1000, 200, 300);
        e.dispdata();
    }
}