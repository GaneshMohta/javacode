import java.util.Scanner;
public class app6 {
public static void main(String [] args){
Scanner my = new Scanner(System.in);
System.out.println("Enter a num");
int num;
num=my.nextInt();
if(num<=100 && num>0){
if(num>50 && num<100)
System.out.println("NUmber is greater than 50");
else
System.out.println("Number is Greater than 0");
}
else if(num>100)
System.out.println("number is greater than 100");
else
System.out.println("Number is less than 0");
my.close();
}
}
