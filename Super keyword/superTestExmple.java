//base class vehicle
class gadi {
    int MaxSpeed=120;
}
//sub class Car extends Vehicle
class Car extends gadi {
    int MaxSpeed=180;
    void dispaly() {
        System.out.println("Max Speed of Vehicle: "+super.MaxSpeed);
    }
}
//drive program to test 
class superTestExmple {
    public static void main(String args[]) {
        Car obj=new Car();
        obj.dispaly();
    }
}