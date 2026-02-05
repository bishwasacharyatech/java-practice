// 1. ABSTRACTION: Defining a "template" that cannot be created directly
abstract class Gadget {
    private String name; // 2. ENCAPSULATION: Private variable (data hiding)

    Gadget(String name) {
        this.name = name;
    }

    // Getter for Encapsulation
    public String getName() {
        return name;
    }

    // Abstract method: Every gadget MUST implement its own version
    abstract void activate();
}

// 3. INHERITANCE: SmartWatch "is a" Gadget
class SmartWatch extends Gadget {
    private int battery;

    SmartWatch(String name, int battery) {
        super(name); // Calling the parent constructor
        this.battery = battery;
    }

    // 4. POLYMORPHISM: Overriding the parent's abstract method
    @Override
    void activate() {
        System.out.println("--- " + getName() + " ---");
        System.out.println("Syncing with satellite... Battery: " + battery + "%");
    }
}

// Another class for Polymorphism
class AnywhereDoor extends Gadget {
    AnywhereDoor() {
        super("Anywhere Door");
    }

    @Override
    void activate() {
        System.out.println("--- " + getName() + " ---");
        System.out.println("Opening a portal to another dimension!");
    }
}
    
public class OOP {
    public static void main(String[] args) {
        // Create an array of different Gadgets (Polymorphism in action)
        Gadget[] pocket = {
            new SmartWatch("Apple Watch", 85),
            new AnywhereDoor()
        };

        System.out.println("Doraemon reaches into his pocket...");
        
        for (Gadget g : pocket) {
            try {
                // Logic Check (Manual Throw)
                if (g instanceof SmartWatch && ((SmartWatch) g).getName().contains("Apple")) {
                    System.out.println("Wait, this isn't a 22nd-century gadget!");
                }
                
                g.activate(); // Polymorphism: The right method runs for the right object
                System.out.println("Status: Success\n");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Next gadget check...");
            }
        }
    }
}