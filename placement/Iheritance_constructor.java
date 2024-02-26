package placement;

class Paret{
    // public Paret() {
    // 	System.out.println("Parent Constructor");
}

class child1 extends Paret{
	// public child1() {
	// 	System.out.println("child1 constructor");
	// }
}

class child2 extends child1{
	void chi() {
		System.out.println("child2 constructor");
	}
}

public class Iheritance_constructor {
  public static void main(String ...args) {
	  child2 c=new child2();
	  c.chi();
  }
}
