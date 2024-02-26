package placement;

class Phone{
	public void call() {
		System.out.println("Calling");
	}
	public void sms() {
		System.out.println("Message");
	}
}

interface Camera{
	void  photo();	
	void record();	
}

interface Audio{
	void song();
	void play();
//	void dis(){
//		System.out.println("vi");
//	}

}

class Smartphone extends Phone implements Camera,Audio{
	
	public void videocall() {
		System.out.println("video calling");
	}
	@Override
	public void photo() {
		System.out.println("photo");
	}
	@Override
	public void record() {
		System.out.println("REcord");
	}
	@Override
	public void play() {
		System.out.println("p");
	}
	public void song() {
		System.out.println("p");
	}
   
}

public class Inter_face {  //INTERFACE
	public static void main(String args[]) {
		Smartphone s=new Smartphone();
		s.photo();
		s.record();
		
	}

}
