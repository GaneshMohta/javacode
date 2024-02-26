import java.util.Scanner;

public class App2 {
    public static void main(String arg[]){
 Scanner my = new Scanner(System.in);
 int a, b;
 System.out.println("value of a:");
a=my.nextInt();
System.out.println("value of b:");
b=my.nextInt();
System.out.println("sum of a+b is"+ (a+b));
my.close();
}
}
