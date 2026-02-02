class pet{
    void eat(){
        System.out.println("eating...");
    }
} 
class cat extends pet{
    void meow(){
        System.out.println("meowing...");
    }
}
class singleTestinheritance {
    public static void main(String[] args) {
        cat myCat = new cat();
        myCat.meow();
        myCat.eat();
    }
}