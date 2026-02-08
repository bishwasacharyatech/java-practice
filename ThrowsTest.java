import java.io.IOException;
class ThrowsTest {
    
    void m() throws IOException {
        throw new IOException("device error");//checked exception
    }

    void n() throws IOException {
        m();
    }
    void p(){
        try {
            n();
        } catch (IOException e) {
            System.out.println("Exception handled");

        }
    }
    public static void main(String[] args) {
        ThrowsTest obj = new ThrowsTest();
        obj.p();
        System.out.println("normal flow...");
    }
}
