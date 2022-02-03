package HandsOnPractice;

//Java Program to Compute Quotient and Remainder

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be the Dividend : ");
        int a = scanner.nextInt();
        System.out.print("Enter the number to be the Divisor : ");
        int b = scanner.nextInt();

        System.out.println("The Quotient is : " + (a/b));
        System.out.println("The Remainder is : " + (a%b));

    }
}
