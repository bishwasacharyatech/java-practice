
// Parent Class (The Basic Model)
class Phone {
    String brand;

    Phone(String brand) {
        this.brand = brand;
        System.out.println(brand + " Phone is powered on.");
    }

    void makeCall() {
        System.out.println("Connecting to network... Dialing...");
    }
}

// Child Class (The Advanced Model)
class SmartPhone extends Phone {
    
    SmartPhone(String brand) {
        // 1. super() calls the Parent constructor
        super(brand); 
    }

    @Override
    void makeCall() {
        // 2. super.method() calls the Parent's version of this method
        super.makeCall(); 
        System.out.println("Smart Feature: Switching to Video Call.");
    }
}

public class MainSuper {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Samsung");
        myPhone.makeCall();
    }
}