package Abstract;

public class AbstractDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(10, 30);
        Figure ref;

        ref = r;
        System.out.println("Area of Rectangle = " + ref.area());

        ref = t;
        System.out.println("Area of Triangle = " + ref.area());
    }
}

