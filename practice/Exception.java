public class Exception {



  public static void main(String[] args){
    try{
        System.out.println(10/0);
    }
    catch(ArithmeticException error){
        System.out.println(error.getMessage());
    }

  }
}
