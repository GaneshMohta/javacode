package MULTITHREADING;
class Threads implements Runnable{
    public void run(){
        int i=1;
    while(i>0){
        try{
            System.out.println("hii");
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            Thread.getAllStackTraces();
        }

    }
    }
}

public class MultithreadusingRunnable {
    public static void main(String[] args) {
        Runnable obj=new Threads();
        Thread t=new Thread(obj);
        t.start();
        int j=1;
        while(j>0){
            try{
                System.out.println("by");
                Thread.sleep(7000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            }
    }
}
