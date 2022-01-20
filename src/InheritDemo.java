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

class BoxWeight extends Box{
    double weight;

    //All parameters are passed
    BoxWeight(double w, double b, double h, double m){
        super(w,b,h);
        weight = m;
    }

    //No parameters are passed
    BoxWeight(){
        super();
        weight = -1;
    }

    //Cube created
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }

    //Object passed as parameter --- Clone
    BoxWeight(BoxWeight o){
        super(o);
        weight = o.weight;
    }

}

class Shipment extends BoxWeight{
    double cost;

    //All parameters
    Shipment(double w, double b, double h, double m, double c){
        super(w,b,h,m);
        cost = c;
    }

    //No parameters
    Shipment(){
        super();
        cost = 0;
    }

    //Cube
    Shipment(double len, double m, double c){
        super(len,m);
        cost = c;
    }

    //Clone
    Shipment(Shipment o){
        super(o);
        cost = o.cost;
    }
}
public class InheritDemo {
    public static void main(String[] args) {
        Shipment s1 = new Shipment(10,20,30,15.2,650);
        Shipment s2 = new Shipment();
        Shipment clone = new Shipment(s1);

        System.out.println("Volume of s1 :"+s1.volume());
        System.out.println("Weight and cost of s1 : "+s1.weight+" "+s1.cost);
        System.out.println("Volume of s2 :"+s2.volume());
        System.out.println("Weight and cost of s2 : "+s2.weight+" "+s2.cost);
    }
}
