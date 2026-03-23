package org.example;

class whats_1{
    whats_1 sent(){
        System.out.println("Single-tick");
        return new whats_1();
    }
}
class whats_2 extends whats_1{
    @Override
    protected whats_1 sent(){
        super.sent();
        System.out.println("Double-tick");
        return new whats_1();
    }
    public void voiceMsg(){
        System.out.println("voice-message");
    }
    public void videoCall(){
        System.out.println("normal-VideoCall");
    }

}

class whats_3 extends whats_2{
    @Override
    public whats_2 sent(){
        super.sent();
        System.out.println("blue-tick");
        return new whats_2();
    }

    @Override
    public void videoCall(){
        super.videoCall();
        System.out.println("Fliters-videoCall");
    }
}
public class Whats_UpDriver {
    public static void main(String[] args) {
        whats_3 w3 = new whats_3();
        w3.sent();
        w3.voiceMsg();
        w3.videoCall();
    }
}