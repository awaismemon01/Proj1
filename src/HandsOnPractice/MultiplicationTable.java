package HandsOnPractice;

import java.util.Scanner;

//Java Program to Generate Multiplication Table

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.print("Enter the number to generate its table : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(number+" * "+i+" = "+(number*i));
        }

    }
}
