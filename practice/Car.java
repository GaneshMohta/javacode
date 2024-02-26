class Cars{
   String bname;

   Cars(){//constructor
   bname="Ford";
   }

   void display(){
	System.out.println(bname);
   }

}

public class Car{
   public static void main(String [] args){
	Cars a=new Cars();
        a.display();
	}
}
