// 1. ABSTRACTION: Defining a general idea of a Device
abstract class Device {
    abstract void powerOn(); // Abstract method (no body)
}

// 2. INHERITANCE: SmartPhone 'is a' Device
class SmartPhone extends Device {
    
    // 3. ENCAPSULATION: Keeping data private and safe
    private String brand;
    private String model;

    // CONSTRUCTOR: Initializes the object
    public SmartPhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // GETTER: A safe way to access private data
    public String getInfo() {
        return brand + " " + model;
    }
    

    // 4. POLYMORPHISM: Providing a specific implementation for powerOn
    @Override
    void powerOn() {
        System.out.println(brand + " " + model + " is booting up... 📱");
    }
}

// MAIN CLASS: The entry point of your program
public class java {
    public static void main(String[] args) {
        
        // Creating an Object (Instance)
        SmartPhone myPhone = new SmartPhone("Apple", "iPhone 15");

        // Accessing methods
        System.out.println("Device Selected: " + myPhone.getInfo());
        myPhone.powerOn();
    }
} 
    

