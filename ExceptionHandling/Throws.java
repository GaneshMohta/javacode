package ExceptionHandling;
public class Throws {

    public int meth2(int l, int b) throws ArithmeticException {
        if (l < 0 || b < 0) {
            throw new ArithmeticException();
        }
        return l * b; // Add a return statement or change return type to void
    }

    public static int meth1() throws ArithmeticException {
        Throws obj = new Throws();
        return obj.meth2(-10, 5);
    }

    public static void main(String[] args) {
        try {
            meth1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
