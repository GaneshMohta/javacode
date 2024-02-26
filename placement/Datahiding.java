package placement;

class Rectangle{
	private int len;
	private int wid;

	public int setLen(int num){
		return this.len=num;
	}
	public void setWid(int wid) {
		this.wid=wid;
	}

	public void display(){
		System.out.println(len*wid);
	}

}

public class Datahiding {
   public static void main(String args[]) {
	Rectangle rec =new Rectangle();
	rec.setLen(5);
	rec.setWid(4);
	rec.display();
   }
}
