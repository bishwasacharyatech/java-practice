// Parent Class
class test {
    // 1. You MUST declare your variables first
    int l, b, h, volume;

    // 2. Methods must be INSIDE these class braces
    void getdata() {
        l = 5;
        b = 6;
        h = 7;
    }

    void calculating() {
        volume = l * b * h;
        System.out.println("Volume of cuboid is: " + volume);
    }
}

// 3. Child Class - Make sure the filename is test.java if this is public
// Or rename this class to match your filename.
public class test_main { 
    public static void main(String args[]) {
        // Create object of the test class
        test obj = new test();
        obj.getdata();
        obj.calculating();
    }
}