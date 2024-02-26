class Area{
    float length;
    float breadth;
    float height;

    void display(){
        System.out.println("lenth*breadth*height "+(length*breadth*height));
    }
}

public class app11 {
   public static void main(String [] args){
    Area a1 = new Area();
    a1.length=45;
    a1.breadth=80;
    a1.height=12;
    a1.display();
   }
}
