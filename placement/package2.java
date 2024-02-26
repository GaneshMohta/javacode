package placement;

import MULTITHREADING.State;  // use when  importing from other package
import Kyonveh.why;
//IMPORTING MORE C;ASS PACKAGES IS POSSIBLE
public class package2 {
public static void main(String[] args) {
    package1 p=new package1();//THE SAME PACKAGE DOES NOT NEED TO IMPORT
    p.mailCheck();
    MehnatKAr m=new MehnatKAr();
    m.display();
    State s=new State();
    s.main(args);
    why k=new why();
    k.kuch();  //protected is not call here

}
}
