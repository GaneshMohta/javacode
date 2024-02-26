import java.util.Scanner;
public class app7 {
    public static void main(String []args ){
        Scanner my = new Scanner(System.in);
        char ch;
        ch=my.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':System.out.println("VOWEL");break;
            default:System.out.println("constant");
        }
        my.close();

    }

}
