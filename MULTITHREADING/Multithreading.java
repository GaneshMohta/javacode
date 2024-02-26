package MULTITHREADING;
class one extends Thread{
    public void run(){
        int i=4;
        while(i>0){
            System.out.println("hii");
          //  i--;
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        int j=4;
        one t=new one();
        t.start();
         while(j>0){
            System.out.println("by");
          //  j--;
    }
    }
}
