class Evenodd{
    int n;
    void evenodd(int x){
        n=x;
    }
    String  Even_Odd(){
        if(n%2==0){
            return "The number is even";
        }
        else{
            return "The number is odd";
        }
    }
}
public class EvenOdd_class {
 public static void main(String[] args) {
     Evenodd e=new Evenodd();
     e.evenodd(33);
     System.out.println(e.Even_Odd());
 }   
}
