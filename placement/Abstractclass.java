package placement;

//HIEREARCAL INHERITANCE
abstract class shape{  //if method of class is abstract then class must be abstract
	abstract double perimeter();
	abstract double area();

	void idpaly() {
		System.out.println("Radius "+perimeter());
	}
}

class circle extends shape{
	double radius;

//	 public circle(double radius) {
//	    this.radius = radius;
//      }

	@Override
	public double perimeter(){
		return 2*Math.PI*radius;
	}

	@Override
	public double area() {
		 return Math.PI*radius*radius;
	}
	public void printe(){
		System.out.println("kkk");
	}
}

class Rect_1 extends shape{ //HIEREARCAL INHERITANCE
	double length;
	double width;
	@Override
	public double perimeter(){
		return 2*length+width;
	}

	@Override
	public double area() {
		 return length*width;
    }
}
public class Abstractclass {
	   public static void main(String args[]) {
	   Rect_1 s=new Rect_1();
	   shape sh=new circle();
	   circle Ci=new circle();
	   //sh.radius=3;           //error

	   Ci.radius=2;
	   s.length=2.3;
	   s.width=3.3;
	   sh.idpaly();
	   System.out.println(s.perimeter());   //sub->ref sub->obj
	   System.out.println(sh.perimeter());  //super->ref sub->obj
   	   System.out.println(Ci.perimeter());  //sub->ref sub->obj
 }
}
