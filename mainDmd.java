 class Book {
    void type() { System.out.println("General Book"); }
}

class EBook extends Book {
    void type() { System.out.println("Electronic Book"); }
}

class PaperBook extends Book {
    void type() { System.out.println("Physical Book"); }
}

class MainDmd {
    public static void main(String[] args) {
        Book b; // Parent reference

        b = new EBook();
        b.type(); // Output: Electronic Book

        b = new PaperBook();
        b.type(); // Output: Physical Book
    }
    
}
