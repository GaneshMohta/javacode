import java.util.Scanner;
public class app8 {
public static void main(String [] args) {
    Scanner my= new Scanner(System.in);
    System.out.println("the Two nums are");
    int a,b;
    a=my.nextInt();
    b=my.nextInt();
    char c;
    System.out.println("the operator to perform");
    c=my.next().charAt(0);
    switch(c){
        case '+':
         System.out.println("the sum of two num:"+(a+b));
         break;
         case '-':
         System.out.println("the subtraction of two num:"+(a-b));
         break;
         case '*':
         System.out.println("the multiply of two num:"+(a*b));
         break;
         case '/':
         System.out.println("the division of two num:"+(a/b));
         break;
         case '%':
         System.out.println("the modulos of two num:"+(a%b));
         break;
         default:
         System.out.println("operator is not correct ");
         my.close();
    }
}
}
