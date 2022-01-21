package MyPackage;

import java.util.Scanner;

public class AccBal {
    public static void main(String[] args) {
        //Balance current[]= new Balance[3];

        Balance current0 = new Balance("ABC",26530);
        Balance current1 = new Balance("DEF",0);
        Balance current2 = new Balance("GHI",-200);

        //for(int i=0;i<3;i++) current[i].show();

        current1.TransferTo(current2,500);
//        current0.show();

//        current1.TransferTo(current2,500);
//        current0.show();
//        current1.show();
//        current2.show();
        Scanner sc = new Scanner(System.in);
        current0.WithDraw(sc.nextDouble());
    }
}

