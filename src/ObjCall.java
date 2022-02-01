class CallTest{
    int a,b;
    CallTest(int i, int j){
        a=i;
        b=j;
    }

    CallTest(){}

    void meth(CallTest o){
        o.a +=10;
        o.b -=5;
    }

    void meth(int i, int j){
        a +=10;
        b -=5;
    }

    CallTest Inc10(CallTest obj){
        return new CallTest(a+10,b+10);
    }

}



public class ObjCall {
    public static void main(String[] args) {
        int i=10, j=20;

        CallTest obj1 = new CallTest(10,20);
        CallTest obj2 = new CallTest();

        System.out.println("Obj1 value before call : "+obj1.a+" "+obj1.b);
        obj1.meth(obj1);
        System.out.println("Obj1 value after call : "+obj1.a+" "+obj1.b);
        System.out.println("");
        System.out.println("Value of i & j before call : "+i+" "+j);
        obj2.meth(i,j);
        System.out.println("Value of i & j after call : "+i+" "+j);

        CallTest obj3 = new CallTest(30,25);
        CallTest obj4;

        obj4 = obj3.Inc10(obj3);
        System.out.println(obj4.a+" "+ obj4.b);
    }
}
