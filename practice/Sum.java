import java.util.Scanner;
public class Sum{
	public static void main(String [] arr){
	Scanner add= new Scanner(System.in);
	int a,b,c,d;
	a=add.nextInt();
	b=add.nextInt();
	c=add.nextInt();
	d=add.nextInt();
	if((a==b)&&(a==c)&&(b==d)){
	System.out.println("Same");
	}
	else
	System.out.println("Not same");

	add.close();
}
}
