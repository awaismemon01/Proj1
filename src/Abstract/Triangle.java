package Abstract;

class Triangle extends Figure{
    Triangle(double a , double b){
        super(a, b);
    }

    @Override
    double area() {
        return (dim1*dim2/2);
    }
}
