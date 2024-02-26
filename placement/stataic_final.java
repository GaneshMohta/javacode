package placement;

class MehnatKAr{
	int a=10;
	static int b=21;

	void display() {
		System.out.println(a+" "+b);
	}
	static void show() {
		System.out.println(b);
	}

}

public class stataic_final {
	public static void main(String Args[]) {
		MehnatKAr mk=new MehnatKAr();
		mk.a=12;
		//mk.b=9;    //=>changing the static vlaue gives warning
	    mk.display();
	    MehnatKAr m1=new MehnatKAr();
	    m1.display();  //a=12    (b=9=>static method)
	}

}
