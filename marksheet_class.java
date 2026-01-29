class Mark{
    int s1,s2,s3;
    void mark(int x,int y,int z){
        s1=x;
        s2=y;
        s3=z;
    }
    int Total(){
        int sum=s1+s2+s3;
        return sum;

    }
    float Percentage(){
        float per=(s1+s2+s3)/3;
        return per;
    }
}
public class marksheet_class {
 public static void main(String[] args) {
     Mark m=new Mark();
     m.mark(90,89,78);
     System.out.println("Total Marks obtained: "+m.Total());
     System.out.println("Percentage obtained: "+m.Percentage());
 }   
}
