package HandsOnPractice;

//Java Program to Reverse a Number

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = scanner.nextInt();

        int revNumber=0;
        while (number!=0){
            revNumber = (revNumber*10) + number%10;
            number /= 10;
        }

        System.out.println("The number after reversing is : "+revNumber);
    }
}
