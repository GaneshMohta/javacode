package placement;

public class variableArguments {
	static void show(int ...a) {
		for(int x:a)
		System.out.println(x);
	}
	
	static void showList(int l,String ...s) { //the variable argument always be last
		for(int i=0;i<s.length;i++) {   //suppose if we do (int ...a,int l) error occurs       
			System.out.println(l+"."+s[i]);
		 l++;
		}
	}
	public static void main(String []args) {//even we write (String ...args)
		show(10);
		show(10,20,30);
		show(new int[]{3,5,7,9,11,13,15}); //ANONYMOUS ARRAY
		showList(1,"Aruna","Babloo","Ajay");
	}
}
