class Triangle {
  int a, b, c, Area, Peri;

  Triangle() {
    a = 9;
    b = 9;
    c = 8;
    Area = a * b * c;
    Peri = a + b + c;
  }
}

public class Sur {
  public static void main(String[] args) {
    Triangle t = new Triangle();

    System.out.println(t.Area);
    System.out.println(t.Peri);

  }
}
