package placement;

public class Method {
	  static int max1(int a,int b) { //static in used because staic call only static method
	 // int max1(int a,int b)for instance the static is not need to call
		  if(a>b)
				return a;
		  else
				return b;
		}

		 public static void main(String arg[]) {
			 int a=10,b=15;
			 System.out.println(max1(a,b));
			 //we also use instance but it have one extra line
			// Method n=new Method();
			 //System.out.println(n.max1(a,b)); 
		 }
		}

