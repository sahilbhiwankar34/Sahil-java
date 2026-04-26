class Color{
    int intensity;
    void display(int i){
        intensity=i;
        if(intensity>=70){
            System.out.println("The color is Bright");
        }
        else{
            System.out.println("The color is not Bright");
        }
    }
}

class Red extends  Color{
    void initialize1(int r){
     super.display(r);
    System.out.println("Above is red color status");
    System.out.println("*******************************");
    }
}

class Blue extends Color{
    
    void initialize2(int b){
        super.display(b);
        System.out.println("Above is Blue color status");
        System.out.println("*******************************");
    }
}

class Green extends Color{
    
    void initialize3(int g){
        super.display(g);
        System.out.println("Above is Green color status");
        System.out.println("*******************************");
    }
}
public class Hierarchical2 {
    public static void main(String[] args) {
        Red re=new Red();
        re.initialize1(20);
        Blue bl=new Blue();
        bl.initialize2(80);
        Green gr=new Green();
        gr.initialize3(100);
    }
}
