import java.util.Date;
public class DatesForm {
    public static void main(String[] args) {
        Date dt=new Date();
        System.out.printf("%tD %n",dt);
        System.out.printf("%td %n",dt);
        System.out.printf("%tm %n",dt);
        System.out.printf("%ty %n",dt);
        System.out.printf("%tB%n",dt);
        System.out.printf("%tb%n",dt);
        System.out.printf("%tA%n",dt);
        System.out.printf("%ta%n",dt);



    }
}
