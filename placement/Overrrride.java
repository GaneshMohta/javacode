package placement;

class Tv{
  void on()
  {
		System.out.println("Tv On");
  }
	void change()
  {
		System.out.println("Tv change");
  }
  
}
class smartTv extends Tv{

	 @Override
	  void on()
	  {
			System.out.println("smartTv On");
	  }
		void change(int a)  //IT NOT AN OVERRIDE BECUSE IT HAVE A PARAMETER
	  {
			System.out.println("smartTv changn");
	  }

	}

public class Overrrride {
   public static void main(String args[]) {
	   //Tv s =new smartTv(); *ERROR* THE FIRST ERROR IS TV CLASS CANNOT CALL SMARTTV CLASS AND
	   //s.change(8);     IF THEY IS NO PARAMETER THEN TV CHANGE OUTPUT
	   smartTv s=new smartTv();
	   s.on();  //smartTv
	   s.change(); //Tv change;
	   s.change(3); //smart tv change

   }
}
