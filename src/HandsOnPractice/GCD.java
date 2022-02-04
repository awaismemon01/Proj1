package HandsOnPractice;

import java.util.Scanner;

//Java Program to Find GCD of two Numbers
public class GCD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = Math.abs(scanner.nextInt());
        int b = Math.abs(scanner.nextInt());

        int gcd = 1;

        for (int i=1; i<=a && i<=b; ++i){

            if(a%i==0 && b%i==0){
                gcd=i;
            }

        }

        System.out.println("The GCD is "+gcd);

    }
}
