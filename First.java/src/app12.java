class Area {
    int l;
    int b;
    int h;

    void display() {
        System.out.println("The area is " + (l * b * h));
    }
    Area() {
        l = 1;
        b = 3;
        h = 3;
    }
}

public class app12 {
    public void main(String []args) {
        Area a1 = new Area();
        a1.display();

    }
}
