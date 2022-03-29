package HandsOnPractice;

import java.util.Scanner;

public class CheckBooleans {
    public static void main(String[] args) {

        boolean a,b,c;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextBoolean();
        b = scanner.nextBoolean();
        c = scanner.nextBoolean();

        if(a){
            if(b || c){
                System.out.println("Two booleans are true");
            }
            else
                System.out.println("No two booleans are true");
        }
        else{
            if(b && c){
                System.out.println("Two booleans are same");
            }
            else
                System.out.println("No two booleans are true");
        }

    }
}
