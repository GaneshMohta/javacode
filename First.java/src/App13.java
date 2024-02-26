import java.util.Scanner;
class Rectangle{
	int len;
	int width;

	void display(){
		System.out.println(len*width);
		System.out.println(2*(len+width));
}
}

public class App13 {
     public static void main(String [] args) {
    	Rectangle a=new Rectangle();
    	Scanner my= new Scanner(System.in);
        a.len=my.nextInt();
        a.width=my.nextInt();
		my.close();



    	 }
     }
