public class Studentmarksheet {
    int stuno;
    String name,sec,subject;
    int m1,m2,m3,m4,m5;
    double per;
    void Info(int s,String n,String se,String Sub,int s1,int s2,int s3,int s4,int s5,double p){
    stuno=s;
    name=n;
    sec=se;
    subject=Sub;
    m1=s1;
    m2=s2;
    m3=s3;
    m4=s4;
    m5=s5;
    per=p;
}
void Display(){
    System.out.println(stuno+"\t"+name+"\t"+sec+"\t"+subject+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+m4+"\t"+m5+"\t"+per);
}
public static void main(String[] args) {
    Studentmarksheet sm1=new Studentmarksheet();
    Studentmarksheet sm2=new Studentmarksheet();
    Studentmarksheet sm3=new Studentmarksheet();
    Studentmarksheet sm4=new Studentmarksheet();
    Studentmarksheet sm5=new Studentmarksheet();
    Studentmarksheet sm6=new Studentmarksheet();

    sm1.Info(1,"Sahil","B","Coding",90,100,100,95,98,98.09);
    sm2.Info(2,"Aditya","B","Coding",85,100,78,89,76,88.98);
    sm3.Info(1,"Tanishq","B","EGD",56,65,70,75,46,70.76);
    sm4.Info(1,"OM","B","Solar",90,43,29,43,32,65.55);
    sm5.Info(1,"Ayush","B","Dsa",70,60,54,67,78,74.54);
    sm6.Info(1,"Pranay","B","Coding",90,100,100,95,95,96.09);

    sm1.Display();
    sm2.Display();
    sm3.Display();
    sm4.Display();
    sm5.Display();
    sm6.Display();
}
}
