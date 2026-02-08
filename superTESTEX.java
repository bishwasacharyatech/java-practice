class Item {
    String type = "Item";

    // Parent Constructor
    Item(String type) {
        this.type = type;
    }

    void info() {
        System.out.println("This is a library item.");
    }
}

class Book extends Item {
    String type = "Hardcover Book"; // parent variable

    Book(String type, String title) {
        //  Using super for CONSTRUCTOR
        super(type); 
        System.out.println("Book object created for: " + title);
    }

    void display() {
        //  Using super for VARIABLE
     
        System.out.println("Child type: " + this.type);
        System.out.println("Parent type: " + super.type);
    }

    @Override
    void info() {
        //  Using super for METHOD
        super.info(); 
        System.out.println("Specifically, it is a Book.");
    }
}

public class superTESTEX {
    public static void main(String[] args) {
        Book myBook = new Book("Reference", "Java Programming");
        System.out.println("--- Method Demo ---");
        myBook.info();
        System.out.println("--- Variable Demo ---");
        myBook.display();
    }
}