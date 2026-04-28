class Calculator{
    void add(int a,int b){
        System.out.println("The sum of "+ a+" and "+b+" is: "+(a+b) );
    }
    void add(int c,int d,int e){
        System.out.println("The sum of "+ c+" and "+d+" and "+e+" is: "+(c+d+e) );
    }
    void add(double f,double g){
        System.out.println("The sum of "+ f+" and "+g+" is: "+(f+g) );
    }
}


public class Overloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(5,10);
        cal.add(45,3,46);
        cal.add(23.45,4.6);
    }
}
