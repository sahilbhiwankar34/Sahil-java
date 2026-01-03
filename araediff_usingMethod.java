public class araediff_usingMethod {
    double radius;
    void initraidus(double r){
        radius=r;
    }
    double calarea(){
        return 3.142*radius*radius;
    }
    public static void main(String[] args) {
        double area1,area2,diff;
        araediff_usingMethod a1=new araediff_usingMethod();
         araediff_usingMethod a2=new  araediff_usingMethod();
         a1.initraidus(20.9);
         a2.initraidus(15.45);
         area1=a1.calarea();
         area2=a2.calarea();
         diff=area1-area2;
         System.out.println("Area of circle 1: "+area1);
         System.out.println("Area of circle 2: "+area2);
         System.out.println("Area difference: "+diff);

    }
}
