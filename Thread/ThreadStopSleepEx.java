class ThreadtestA extends Thread{
    public void run(){
       for(int i=1;i<=5;i++){
        System.out.println("Running Thread "+i+" from class A");
          // if(i==3) stop();
        if(i==3) interrupt();//change in stop() method 
       }
       System.out.println("exit from class A");

    }
}
class ThreadtestB extends Thread{
    public void run(){
       for(int j=1;j<=5;j++){
        System.out.println("Running Thread "+j+" from class B");
        if (j==2)
            try {
                sleep(1000);//in miniseconds
            } catch (Exception e) {
                System.out.println(e);

            }
        }
         System.out.println("exit from class B");
    }
}
class ThreadtestC extends Thread{
    public void run(){
       for(int k=1;k<=5;k++){
        System.out.println("Running Thread "+k+" from class C");
        }
         System.out.println("exit from class C");
    }
}
public class ThreadStopSleepEx {
    public static void main(String[] args) {
        new ThreadtestA().start();
        new ThreadtestB().start();  
        new ThreadtestC().start();

    }
}