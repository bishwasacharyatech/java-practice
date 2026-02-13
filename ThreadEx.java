class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println("Running  Thread: " + i+" from Class A");

        } 
        System.out.println("Exiting from Class A");
    
    }
}

class ThreadExB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println("Running  Thread: " + i+" from Class B");

        } 
        System.out.println("Exiting from Class B");
    
    }
}
class ThreadExC extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println("Running  Thread: " + i+" from Class C");

        } 
        System.out.println("Exiting from Class C");
    
    }
}
public class ThreadEx {
    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadExB().start();
        new ThreadExC().start();
    }
}

    