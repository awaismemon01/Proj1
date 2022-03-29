package HandsOnPractice;

import java.util.Scanner;

//Java Program to Check Whether a Character is Alphabet or Not

public class CheckAlphabet {
    public static void main(String[] args) {

        //A-65 Z-90 a-97 z-122
        System.out.print("Enter a Character : ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if((int) ch >=65 & (int) ch <=90 || (int) ch >=97 & (int) ch <=122){
            System.out.println("It is an Alphabet");
        }
        else{
            System.out.println("It is not an Alphabet");
        }

    }
}
