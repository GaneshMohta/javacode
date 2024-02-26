package MULTITHREADING;

class My extends Thread{

    My(String name){
        super(name);
    }
    @Override
    public void run() {
        //int i=0;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        // while (i<100000) {
        //    System.out.println("Radhey");
        //    i++;

        // }
    }

}

public class State {
    public void main(String[] args) {
        My m=new My("name");
        System.out.println("Priority:"+m.getPriority());
        System.out.println("State:"+m.getState());
        m.start();
        System.out.println("State:"+m.getState());
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     System.out.println(e.getMessage());
        // }
        System.out.println(m.getState());
        // while (true) {
        //     System.out.println("Krishna");
        // }
    }

}
