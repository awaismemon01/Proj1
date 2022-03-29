package HandsOnPractice;

import java.util.Scanner;

//Java Program to Find ASCII Value of a character

public class FindASCIIValue {
    public static void main(String[] args) {

        System.out.print("Enter a Character : ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println("The ASCII value of character is : "+ (int) ch);
    }
}
