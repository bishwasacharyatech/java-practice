class ThreadproA extends Thread{
    public void run(){
       for(int i=1;i<=5;i++){
        System.out.println("Running Thread "+i+" from class A");
          // if(i==3) stop();
        if(i==3) interrupt();//change in stop() method 
       }
       System.out.println("exit from class A");

    }
}
class ThreadproB extends Thread{
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
class ThreadproC extends Thread{
    public void run(){
       for(int k=1;k<=5;k++){
        System.out.println("Running Thread "+k+" from class C");
        }
         System.out.println("exit from class C");
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        ThreadproA t1 = new ThreadproA();
        ThreadproB t2 = new ThreadproB();
        ThreadproC t3 = new ThreadproC();
        t1.setPriority(10);     
        t2.setPriority(5);
        t3.setPriority(1);
        t1.start();
        t2.start();  
        t3.start();

    }

    
}