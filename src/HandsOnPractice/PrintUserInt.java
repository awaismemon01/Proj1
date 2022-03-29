package HandsOnPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

//Java Program to Print an Integer (Entered by the User)

public class PrintUserInt {
    public static void main(String[] args) {

        System.out.print("Enter an Integer: ");
        Scanner scanner = new Scanner(System.in);

        try {

            int a = scanner.nextInt();
            System.out.println("\nYou entered "+a);
        }
        catch (InputMismatchException e){
            System.out.println("You didn't enter a valid integer");
        }
        scanner.close();
    }
}
