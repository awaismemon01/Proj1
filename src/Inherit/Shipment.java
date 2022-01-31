package Inherit;

class Shipment extends BoxWeight {
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

