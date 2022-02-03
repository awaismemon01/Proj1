package HandsOnPractice;

import java.util.Scanner;

//Java Program to Add Two Integers (Entered by the User)

public class AddInt {
    public static void main(String[] args) {

        System.out.print("Enter Two Numbers to Add: ");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("The addition is " + (scanner.nextInt() + scanner.nextInt()));
        }
        catch (Exception e){
            System.out.println("You didn't enter valid number/s");
        }
    }
}
