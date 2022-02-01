package Inherit;

class Box{
    private double width;
    private double breadth;
    private double height;

    //All parameters defined
    Box(double w, double b, double h){
        width = w;
        breadth = b;
        height = h;
    }

    //No parameters defined
    Box(){
        width = -1;
        breadth = -1;
        height = -1;
    }

    //All parameters are same i.e Cube
    Box(double len){
        width = breadth = height = len;
    }

    //Object is passed as parameter --- Clone
    Box( Box o){
        width = o.width;
        breadth = o.breadth;
        height = o.height;
    }

    double volume(){
        return height*width*height;
    }
}
