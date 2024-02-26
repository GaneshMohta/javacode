package ExceptionHandling;

class NoVowelException extends Exception{
    public String NoVowelString(){
        return "Their is no vowel";
    }
}

public class Userdefine {
    public static void vowelchecker(String str){
        try {
            if(!(str.toLowerCase().matches(".*[aeiou].*"))){
                throw new NoVowelException();
            }
            else{
                System.out.println("their is a vowel");
            }
        } catch (NoVowelException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

 public static void main(String[] args){
    String str="yyyyy";
    vowelchecker(str);
 }
}
