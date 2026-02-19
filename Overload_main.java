 class Overload_main {
    public static void main(int a){
        System.out.println(a);
     
    }
    public static void main(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        System.out.println("calling main");
        main(100);
        main("softsense");
    }
}
