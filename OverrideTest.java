class Store {
    // Parent method using float
    void applyDiscount(float price) {
        float finalPrice = price - 5.0f; // Basic $5 discount
        System.out.println("Basic Store Price: " + finalPrice);
    }
}

class FestiveStore extends Store {
    @Override
    void applyDiscount(float price) {
        // Child class provides a bigger discount (10%)
        float finalPrice = price * 0.90f; 
        System.out.println("Festive Season Price (10% off): " + finalPrice);
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        // Parent reference pointing to Child object
        Store myStore = new FestiveStore();
        
        // This will call the FestiveStore version
        myStore.applyDiscount(100.0f); 
    }
}