package HandsOnPractice;

//Java Program to Display Fibonacci Series

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.print("Size of Fibonacci series to print :");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        if(size>2) {
            int first = 0, second = 1;
            System.out.print(first+" ");
            System.out.print(second+" ");
            for (int i = 2; i < size ; i++) {
                int next = first + second;
                first = second;
                second = next;
                System.out.print(next+" ");
            }
        }
        else{
            System.out.println("NUMBER SHOULD BE GREATER THAN 2");
        }
    }
}
