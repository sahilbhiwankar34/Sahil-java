 class Calculate{
    int a,b,c;
    void input_value(int x,int y,int z){
        a=x;
        b=y;
        c=z;
    }
    float display_average(){
        float avg=(a+b+c)/3;
        return avg;
    }
}
class class2{
    public static void main(String[] args) {
        Calculate c=new Calculate();
        c.input_value(10,20,4);
        System.out.println("The average is : "+c.display_average());

    }
}
