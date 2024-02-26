package placement;

public class Method1 {
   static void change(int A[],int index,int value) {
	   A[index]=value;
   }
   static void change2(int n,int value) {
	   n=value;
   }
  public static void main(String []arg) {
	  int A[]= {2,4,5,6,8};
	  change(A,2,17);
	  for(int x:A) {
		  System.out.println(x);
	  }
	  int n=10;
	  change2(n,20);
	  System.out.println("Value of primitive"+n);//hera the value no change in primitive 
  }
}
