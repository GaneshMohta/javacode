class Demo{
   static int a;
   static int b;
 static{
  System.out.println("value intalize");
  b=8;
}
 void display(){
System.out.println("Static");
}
}

public class Staticdemo{
    public static void main(String args []){
        System.out.println("Not intalize");
	      Demo d= new Demo();
        Demo.a=3;
        System.out.println(Demo.a+" "+Demo.b);
        d.display();
    }
}
