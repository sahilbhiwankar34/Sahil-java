class MusicPlayer extends Thread{

    @Override public void run(){
       
       try{ System.out.println("Playing song.....");
        Thread.sleep(2000);

        System.out.println("Progress 1");
        Thread.sleep(2000);

        System.out.println("Progress 2");
        Thread.sleep(2000);

        System.out.println("Progress 3");
        Thread.sleep(2000);

    }
    catch(InterruptedException e){
        System.out.println("Thread was interrupted");
    }
}
}

public class Music_Player {
    public static void main(String[] args) {
        MusicPlayer t=new MusicPlayer();
        t.start();
    
}
}
