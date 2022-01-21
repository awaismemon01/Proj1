abstract class Figure{
    double dim1;
    double dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(double a , double b){
        super(a, b);
    }

    @Override
    double area() {
        //System.out.println("Inside area of rectangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a , double b){
        super(a, b);
    }

    @Override
    double area() {
        return (dim1*dim2/2);
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        Triangle t = new Triangle(10,30);
        Figure ref;

        ref=r;
        System.out.println("Area of Rectangle = "+ref.area());

        ref=t;
        System.out.println("Area of Triangle = "+ref.area());
    }
}
