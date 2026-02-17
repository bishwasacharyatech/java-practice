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
        for (int j = 1; j <= 5; j++){
            System.out.println("Running  Thread: " + j+" from Class B");

        } 
        System.out.println("Exiting from Class B");
    
    }
}
class ThreadExC extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++){
            System.out.println("Running  Thread: " + k+" from Class C");

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

    