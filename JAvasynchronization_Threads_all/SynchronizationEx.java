package JAVAsynchronization_Threads_all;

class AThread
{
    synchronized void deposit(int amount){
        System.out.println("deposit  complete with rs. "+amount);
    }
    synchronized void withdraw(int amount){
        System.out.println("withdraw complete with rs. "+amount);
    }
}
public class SynchronizationEx {
    public static void main(String[] args) {
        AThread a = new AThread();
        new Thread(){
            public void run(){
                a.deposit(1000);
            }
        }.start();
        new Thread(){
            public void run(){
                a.withdraw(500);
            }
        }.start();
       
    }
}
