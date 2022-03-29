package HandsOnPractice;

import java.util.Scanner;

//Java Program to Count Number of Digits in an Integer

public class CountDigits {
    public static void main(String[] args) {

        System.out.println("Enter an Integer :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count=0;
        while (number!=0){
            number /= 10;
            count++;
        }

        System.out.println("The number of digits in the integer are: "+count);
    }
}
