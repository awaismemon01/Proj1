package HandsOnPractice;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {

        System.out.print("Enter the Number : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a%2==0) System.out.println("The number is even.");
        else System.out.println("The number is odd");

    }
}
