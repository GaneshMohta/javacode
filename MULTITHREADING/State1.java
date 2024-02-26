package MULTITHREADING;

class Mythread implements Runnable{
@Override
public void run() {
while (true) {
    System.out.println("hello");
}
}
}

public class State1 {
public static void main(String[] args) {
    Mythread t=new Mythread();
    Thread my=new Thread(t);
    my.setDaemon(true);my.start();
    try {
        Thread.sleep(100);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
