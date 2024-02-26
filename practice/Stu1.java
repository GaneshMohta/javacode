class Students{
   String name;

   Students(){
   name="unknown";
   }
   
   Students(String a){
	name=a;
   }
   
}
 
public class Stu1{
   public static void main(String [] args){
	Students s=new Students();
	System.out.println(s.name);
	Students a=new Students("mani");
        System.out.println(a.name);
	}
}