import java.util.Scanner;
public class app5 {
    public static void main(String [] arg){
        Scanner my = new Scanner(System.in);
        int a;
        System.out.print("enter the value of a:");
        a=my.nextInt();
        if (a>0) {
            System.out.println("POSITIVE");
        }
        else if(a==0){
            System.out.println("NEUTRAL");
        }
        else if(a<0){
            System.out.println("NEGATIVE");
        }
        else{
            System.out.println("OTHER CHARACTER");
        }
        my.close();
    }

}
