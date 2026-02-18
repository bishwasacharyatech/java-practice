package JAVAsynchronization_Threads_all;

class MyThread{
    String resource1 = "resource1";
    String resource2 = "third Semester";


    void methodA(){
        synchronized(resource1){
            System.out.println("Thread 1: locked resource 1");
         try{ Thread.sleep(100);}
         catch(Exception e )   
         {}

             synchronized(resource2){
                System.out.println("Thread 1: locked resource 2");
            }
        }
    }
    void methodB(){
     synchronized(resource2){
            System.out.println("Thread 2: locked resource 2");
         try{ Thread.sleep(100);}
         catch(Exception e)
         {}        
             synchronized(resource1){
                System.out.println("Thread 2: locked resource 1");
            }
        }
    }
}
public class DeadlockEx {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        new Thread(){
            public void run(){
                t.methodA();
            }
        }.start();
        new Thread(){
            public void run(){
                t.methodB();
            }
        }.start();
    }
}


