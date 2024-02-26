class Cardata{
    String model;
    String Name;
    int price;
    String owner;

Cardata(){
model="Suv";
Name="Mahindra";
price=1000000;
owner="Ganesh Mal";
}
 void display(){
   System.out.println("model: "+model+" name: "+Name+" price: "+price+" owner:"+owner);
}
}

public class Car1{
 public static void main(String [] args){
   Cardata cd=new Cardata();
  cd.display();
}
}