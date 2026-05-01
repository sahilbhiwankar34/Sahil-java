class DownloadManager implements Runnable{

    String filename;

    DownloadManager(String filename){
        this.filename=filename;
    }

    @Override public void run(){
        try{
            System.out.println("Downloading file "+filename+"...");
            Thread.sleep(2000);

            System.out.println("Download Completed "+filename+".");
            
        }

        catch(InterruptedException e){
            System.out.println("Error Downloading File");
        }
    }
}


public class Download_Manager {
    public static void main(String[] args) {
        Thread t1=new Thread(new DownloadManager("file1.pdf"));
        Thread t2=new Thread(new DownloadManager("Mp4.jpg"));
         Thread t3=new Thread(new DownloadManager("science.zip"));

         t1.start();
         t2.start();
         t3.start();

    }
}
