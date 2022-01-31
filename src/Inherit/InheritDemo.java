package Inherit;

public class InheritDemo {
    public static void main(String[] args) {
        Shipment s1 = new Shipment(10, 20, 30, 15.2, 650);
        Shipment s2 = new Shipment();
        Shipment clone = new Shipment(s1);

        System.out.println("Volume of s1 :" + s1.volume());
        System.out.println("Weight and cost of s1 : " + s1.weight + " " + s1.cost);
        System.out.println("Volume of s2 :" + s2.volume());
        System.out.println("Weight and cost of s2 : " + s2.weight + " " + s2.cost);
    }
}