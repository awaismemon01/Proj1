package HandsOnPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

//Java Program to Check Whether a Number is Positive or Negative

public class CheckPositive {
    public static void main(String[] args) {

        System.out.print("Enter a number :");
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            if(a<0){
                System.out.println(a+" is Negative");
            }
            else if (a>0){
                System.out.println(a+" is Positive");
            }
            else {
                System.out.println("IS ZERO");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Integer");
        }
    }
}
