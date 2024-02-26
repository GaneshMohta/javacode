public class Dbl{
  public static void main(String arr []){
	double a,b;
	a=Double.parseDouble(arr[0]);
	b=Double.parseDouble(arr[1]);
	if(a<=1 && b<=1 && a>=0 && b>=0)
	System.out.println("True");
	else
	System.out.println("False");
	}
}
