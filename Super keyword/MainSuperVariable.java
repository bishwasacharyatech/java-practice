 // Parent Class
class Device {
    int batteryLife = 24; // Parent variable
}

// Child Class
class Laptop extends Device {
    int batteryLife = 10; // Child variable (hides the parent variable)

    void displayInfo() {
        // Accessing the Child variable directly
        System.out.println("Child Laptop Battery: " + batteryLife + " hours");

        // Using 'super' to access the Parent variable
        System.out.println("Parent Device Battery: " + super.batteryLife + " hours");
    }
}

public class MainSuperVariable {
    public static void main(String[] args) {
        Laptop myLap = new Laptop();
        myLap.displayInfo();
    }
    
}
