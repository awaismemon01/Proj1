package Inherit;

class BoxWeight extends Box {
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
