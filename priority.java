class ThreadPriority extends Thread{
    ThreadPriority(String name){
        super(name);
    }
    @Override public void run(){
        Thread t=Thread.currentThread();
        System.out.println(t.getName()+" has priority: "+t.getPriority());
    }
}


public class priority {
    public static void main(String[] args) {
    ThreadPriority t1=new ThreadPriority("Thread1");
     ThreadPriority t2=new ThreadPriority("Thread2");
      ThreadPriority t3=new ThreadPriority("Thread3");
           
           t1.setPriority(4);
           t2.setPriority(5);
           t3.setPriority(6);

           t1.start();
           t2.start();
           t3.start();

    }
}
