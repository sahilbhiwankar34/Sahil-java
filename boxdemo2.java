class box1{
    double w;
    double h;
    double d;
    void volume(){
        System.out.println("Volume is ");
        System.out.println(w*h*d);
    }
}
class boxdemo2{
    public static void main(String args[]){
        box1 mybox1=new box1();
        mybox1.w=10;
         mybox1.h=10;
         mybox1.d=10;
         mybox1.volume();
    }
}
