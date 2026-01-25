// Parent Class
class Watch {
    String brand;

    // Parent Constructor
    Watch(String brand) {
        this.brand = brand;
        System.out.println(brand + " hardware is ready.");
    }
}

// Child Class
class SmartWatch extends Watch {
    int batteryLevel;

    // Child Constructor
    SmartWatch(String brand, int battery) {
        // 1. MUST be the first line: Calls the parent constructor
        super(brand); 
        
        this.batteryLevel = battery;
        System.out.println("Smart features loaded. Battery: " + batteryLevel + "%");
    }
}

public class MainSuperConstructor {
    public static void main(String[] args) {
        // This will trigger BOTH the Parent and Child constructors automatically
        SmartWatch myWatch = new SmartWatch("Apple", 85);
    }
}