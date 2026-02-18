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
        // MUST be the first line: This sends the brand up to the Parent
        super(brand); 
        
        this.batteryLevel = battery;
        System.out.println("Smart features loaded. Battery: " + batteryLevel + "%");
    }
}
public class MainSuperConstructor {
    public static void main(String[] args) {
        // 1. Create the watch
        SmartWatch myWatch = new SmartWatch("Apple", 85);

        // 2. USE the watch (This removes the "unused" warning)
        System.out.println("The brand of my new watch is: " + myWatch.brand);
    }
}