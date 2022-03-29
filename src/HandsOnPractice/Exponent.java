package HandsOnPractice;

import java.util.Scanner;

//Java Program to Calculate the Power of a Number

public class Exponent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the Exponent number: ");
        int exponent = scanner.nextInt();

        System.out.println("The answer is : "+ (Math.pow(base,exponent)));

    }
}
