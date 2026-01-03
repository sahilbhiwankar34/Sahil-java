public class areadiff {
    public static void main(String args[]){
        double r1,r2,a1,a2,diff;
        r1=90;
        r2=87;
        a1=3.142*r1*r1;
        a2=3.142*r2*r2;
        diff=a1-a2;
        System.out.println("First Circle: ");
        System.out.println();
        System.out.println("radius of  circle 1: "+r1);
        System.out.println("Area of circle1: "+a1);
         System.out.println();
        System.out.println("Second Circle: ");
          System.out.println();
         System.out.println("radius of  circle 2: "+r2);
          System.out.println("Area of  circle 2: "+a2);
          System.out.println("Difference: "+diff);
    }
}
