package HandsOnPractice;

//Java Program to Calculate the Sum of Natural Numbers

import java.util.Scanner;

public class SumOfNaturalNos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Upper limit of numbers to be added : ");
        int limit = scanner.nextInt();

        if(limit<0) {
            System.out.println("Natural numbers start from 0");
        }
        else {
            int sum = 0;
            for (int i = 0; i <= limit; i++) {
                sum += i;
            }

            System.out.println("The sum of natural numbers from 0 to " + limit + " is : " + sum);
        }
    }
}
