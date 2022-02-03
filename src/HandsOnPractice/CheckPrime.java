package HandsOnPractice;

//Java Program to Display Prime Numbers Between Two Intervals

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {

        System.out.print("Enter a number :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number>0) {
            int factor = 2;
            boolean flag = false;
            while (factor != number/2) {
                if (number % factor == 0) {
                    flag = true;
                    break;
                }
                factor++;
            }

            if (flag) {
                System.out.println("Not Prime");
            }
            if (!flag){
                System.out.println("Prime");
            }
        }
        else{
            System.out.println("Invalid Integer");
        }

    }
}
