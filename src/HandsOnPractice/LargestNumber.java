package HandsOnPractice;

//Java Program to Find the Largest Among Three Numbers

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Three Numbers : ");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        System.out.print("The largest number is ");
        if(a>b){
            System.out.print(Math.max(a, c));
        }
        else{
            System.out.print(Math.max(b, c));
        }
    }
}
