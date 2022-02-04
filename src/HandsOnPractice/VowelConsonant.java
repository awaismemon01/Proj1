package HandsOnPractice;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        System.out.print("Enter a Character : ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");

    }
}
