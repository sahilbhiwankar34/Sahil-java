class Staff{
    int codename;
    void initialize(int c){
        codename=c;
    }
    
}

class Teacher extends Staff{
    String subject;
    void initialize(String s,int co){
        super.initialize(co);
        subject=s;
        

    }
    void display(){
        System.out.println("CodeName: "+codename);
        System.out.println("Subject Taught: "+subject);
    }
}

class Typist extends Staff{
    int speed;
    void initialize(int sp,int cod){
        super.initialize(cod);
        speed=sp;
    }
    void display(){
        System.out.println("CodeName: "+codename);
        System.out.println("Speed: "+speed);
    }
}

class Officer extends Staff{
    char grade;
    void initialize(char  g,int code){
        super.initialize(code);
        grade=g;
    }
    void display(){
        System.out.println("CodeName: "+codename);
        System.out.println("Grade: "+grade);
    }
}


public class Hierarchical {
    public static void main(String[] args) {
        Teacher t =new Teacher();
        t.initialize("English",101);
        t.display();
        Typist ty=new Typist();
        ty.initialize(400,102);
        ty.display();
        Officer o=new Officer();
        o.initialize('A',103);
        o.display();
    }
}
