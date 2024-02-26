package placement;

public class wrapperClass {
    public static void main(String[] args) {
        Integer a=Integer.valueOf(456);
        Integer b=Integer.valueOf(456);
        Integer c=456;
        System.out.println(a.equals(b)); //true
        System.out.println(a==b);    //false
        System.out.println(a.equals(c));  //true
        System.out.println(a==c);   //false

        //boxing;
        int m=456;
        Integer n=Integer.valueOf(m);
        System.out.println(a.equals(m));   //true

        //autoboxing
        int x=10;
        Integer y=x;
        System.out.println(n +" "+y);

        //autounboxing;
        int k=a;
        System.out.println(k);
        // unboxing
        int l=c.intValue();
        System.out.println(l);

        Integer m1=Integer.valueOf("A",16);
        Integer m2=Integer.valueOf("11111", 2);
        Integer m3=Integer.decode("0xA7");
        System.out.println(m1+" "+m2+" "+m3);

    }

}
