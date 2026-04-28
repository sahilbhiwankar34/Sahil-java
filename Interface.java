interface Filterable{
     void apply_filter(String n);
    void reset_filter();
}

class ImageProcessor implements Filterable{
    String s1;
    ImageProcessor(String s1){

this.s1=s1;
    }

    @Override public void apply_filter(String type){
     System.out.println("The Image type is: "+type);
    }

    @Override public void reset_filter()
{
    System.out.println("The filter was reset to: "+s1);
}
}



public class Interface {
   public static void main(String[] args) {
       ImageProcessor i=new ImageProcessor("JPG");
       i.apply_filter("PDF");
       i.reset_filter();
   } 
}
