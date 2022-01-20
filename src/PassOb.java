class Test{
    int a,b;
    Test(int i, int j){
        a=i;
        b=j;
    }

    boolean equalTo(Test o){
        if(o.a==a & o.b==b) return true;
        else return false;
    }
}


public class PassOb {
    public static void main(String[] args) {
        Test obj1 = new Test(2,3);
        Test obj2 = new Test(2,3);
        Test obj3 = new Test(5,6);

        System.out.println("Obj1 = Obj2 : "+ obj1.equalTo(obj2));
        System.out.println("Obj1 = Obj3 : "+ obj1.equalTo(obj3));
    }
}
