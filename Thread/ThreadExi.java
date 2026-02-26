class ThreadExampleA implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running  Thread: " + i + " from Class A");

        }
        System.out.println("Exiting from Class A");

    }
}

class ThreadExampleB implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Running  Thread: " + j + " from Class B");

        }
        System.out.println("Exiting from Class B");

    }
}


class ThreadExampleC implements Runnable {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("Running  Thread: " + k + " from Class C");

        }
        System.out.println("Exiting from Class C");

    }
}

public class ThreadExi {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleA());
        Thread t2 = new Thread(new ThreadExampleB());
        Thread t3 = new Thread(new ThreadExampleC());
        t1.start();
        t2.start();
        t3.start();
    }
}
