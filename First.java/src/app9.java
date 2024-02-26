import java.util.Scanner;
public class app9 {
    public static void main(String [] args){
      Scanner my = new Scanner(System.in);
      System.out.println("The give three number");
      int a,b,c;
      System.out.print("Enter the first digit");
      a=my.nextInt();
      System.out.print("Enter the second digit");
      b=my.nextInt();
      System.out.print("Enter the third digit");
      c=my.nextInt();
      if(a>b && a>c)
      System.out.println(a+"is the greatest");
      else if(b>c)
      System.out.println(b+"is greatest");
      else
      System.out.println(c+"is greatest");
      my.close();
    }

}
