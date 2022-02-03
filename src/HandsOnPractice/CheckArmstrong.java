package HandsOnPractice;

import java.util.Scanner;

//Java Program to Check Armstrong Number

public class CheckArmstrong {
    public static void main(String[] args) {

        System.out.println("Enter an Integer :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result=0,count=0;

        int a = number;
        while (a!=0){
            a /= 10;
            count++;
        }
        int b = number;
        while(b != 0){
            result += Math.pow((b%10),count);
            b /= 10;
        }

        if(result==number){
            System.out.println(number+" is an Armstrong Number");
        }
        else {
            System.out.println(number+" is not an Armstrong Number");
        }

    }
}
