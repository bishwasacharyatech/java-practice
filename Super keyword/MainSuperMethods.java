// Parent Class
class BankAccount {
    void calculateInterest() {
        System.out.println("Applying basic 2% interest...");
    }
}

// Child Class
class SavingsAccount extends BankAccount {
    @Override
    void calculateInterest() {
        // 1. Call the parent's method first
        super.calculateInterest(); 
        
        // 2. Add extra work specific to SavingsAccount
        System.out.println("Adding extra 1.5% Savings Bonus!");
    }
}

public class MainSuperMethods {
    public static void main(String[] args) {
        SavingsAccount myAcc = new SavingsAccount();
        
        // This will run BOTH the parent and child logic
        myAcc.calculateInterest();
    }
    
}
