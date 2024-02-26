class Greet<T> {
    public static <T> void say(T obj){
        System.out.println("Namaste "+obj);
    }
}


public class Generic {
    public static void main(String[] args) {
        Greet.say("Ganesh");
        Greet.say('S');
        Greet.say(17);

    }

}
