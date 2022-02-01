class Gen<T>{
    T ob;

    Gen(T o){
        ob=o;
    }

    public T getOb() {
        return ob;
    }

    void showType(){
        System.out.println("Type of T is : "+ob.getClass().getName());
    }
}


public class GenericsDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("V : "+v);

        Gen<String> strOb = new Gen<>("Test");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("V : "+str);
    }
}
