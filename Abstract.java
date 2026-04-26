abstract class Sound{
    abstract void playMessage();
}

class TextMessage extends Sound{
    @Override void playMessage(){
        System.out.println("The text is displayed");
    }
}

class VoiceMessage extends Sound{
@Override void playMessage(){
    System.out.println("The voice message is played");
}
}

class FaxMessage extends Sound{

    @Override void playMessage(){
        System.out.println("The fax message is Showed");
    }
}

public class Abstract{
    public static void main(String args[]){
 Sound s;
 s=new TextMessage();
 s.playMessage();

 s=new VoiceMessage();
 s.playMessage();

 s=new FaxMessage();
 s.playMessage();
    }
}