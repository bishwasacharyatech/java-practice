class GrandParent {
    void showG() {
        System.out.println("GrandParent");

    }
}

// 1. Single Inheritance (Parent -> Child)
class Parent extends GrandParent {
    void showP() {
        System.out.println("Parent");
    }
}

// 2. Multi-level Inheritance (GrandParent -> Parent -> Child)
class Child extends Parent {
    void showC() {
        System.out.println("Child");
    }
}

// 3. Hierarchical Inheritance (Parent -> Child & Parent -> AnotherChild)
class AnotherChild extends Parent {
}

public class program12 {
    public static void main(String[] args) {
        Child c = new Child();
        c.showG(); // From GrandParent
        c.showP(); // From Parent
        c.showC(); // From Child
    }
}