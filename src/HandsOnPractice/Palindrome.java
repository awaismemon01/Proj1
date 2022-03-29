package HandsOnPractice;

import java.util.Scanner;

//Java Program to Check Palindrome

public class Palindrome {
    public static void main(String[] args) {

        System.out.print("Enter the string : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String revString = "";

        for(int i=string.length()-1; i>=0; i--){
            revString += string.charAt(i);
        }

        if(string.equalsIgnoreCase(revString)){
            System.out.println("The String is Palindrome");
        }

        else {
            System.out.println("The String is not Palindrome");
        }
    }
}
