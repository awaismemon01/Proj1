package MyPackage;

public class Balance {
    String name;
    double bal;

    Balance(String n, double b){
        name= n;
        bal= b;
    }

    void show(){
        if(bal<0) System.out.print("--> ");
        System.out.println("Name : "+name+"\nBalance : "+bal);
    }

    void TransferTo(Balance o, double b){
        if(bal<b) {
            System.out.println("Not enough balance");
            return;
        }
        bal -= b;
        o.bal += b;
        o.show();
    }

    void WithDraw(double b){
        if (bal<b){
            System.out.println("Not enough balance to WithDraw");
            return;
        }
        bal-=b;
        System.out.println(b+" Debited from account");
        show();
    }
}
