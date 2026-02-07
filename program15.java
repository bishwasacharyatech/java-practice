interface Camera {
    void takePhoto();
}

interface Phone {
    void makeCall();
}

class SmartPhone implements Camera, Phone {
    public void takePhoto() {
        System.out.println("Photo taken!");
    }

    public void makeCall() {
        System.out.println("Calling...");
    }
}

public class program15 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.makeCall();
        sp.takePhoto();
    }
}