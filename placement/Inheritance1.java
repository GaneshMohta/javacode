package placement;

class Circle{
	public double radius;

	public double area() {
		return Math.PI*radius*radius;
	}

	public double peri() {
		return 2*Math.PI*radius;
	}
}

class Cylinder extends Circle{
	public double height;

	public double volume() {
		return area()*height;
	}
	public void close() {
        System.out.println("Account closed.");
    }
}

public class Inheritance1 {
	public void main(String[] args) {
		Cylinder c=new Cylinder();
		c.radius=7;
		c.height=10;
		System.out.println("volume:"+c.volume());
		System.out.println("area:"+c.area());
		c.close();
	}
}
