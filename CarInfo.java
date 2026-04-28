import java.util.Scanner;
class Carrental {
int carid;
String cartype;
float rent;

void getcar(int carid,String cartype){
    this.carid=carid;
    this.cartype=cartype;
}

void getrent(){

switch(cartype.toUpperCase()){
    case "SUV"->
        rent=2500;
    case "Van"->
        rent=800;
    case "Nano"->
        rent=1000;
    case "Small"->
        rent=1000;
    default-> System.out.println("Invalid car type");
    
    

}
}

void Showcar(){
    System.out.println("Car Id: "+carid);
    System.out.println("Car type: "+cartype);
    System.out.println("Rent: "+rent+" Rs");
}
}

public class CarInfo{
    public static void main(String args[]){
    Carrental c=new Carrental();
    try(Scanner sc=new Scanner(System.in)){

    for(int i=0;i<5;i++){

System.out.print("Enter CAR id: ");
int ci=sc.nextInt();
System.out.print("Enter car type: ");
String ct=sc.next();

    c.getcar(ci,ct);

    c.getrent();

    c.Showcar();
    c.rent=0;
}
}
    }
}
