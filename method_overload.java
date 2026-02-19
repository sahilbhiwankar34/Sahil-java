class Method{
    void display(){
        System.out.println("No argument");
    }
    void display(int x){
        System.out.println("x = "+x);
    }
    void display(int x,int y){
        System.out.println("avg = "+ (x+y)/2);
    }
   

}

public class method_overload {
    public static void main(String[] args) {
        Method mo=new Method();
        mo.display();
        mo.display(5);
        mo.display(12,13);
       
    }
}
