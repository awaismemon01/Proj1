package HandsOnPractice;

//Java Program to Find LCM of two Numbers

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int lcm;

        lcm = Math.max(n1, n2);

        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                System.out.println("The LCM is : "+lcm);
//                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            lcm++;
        }

    }
}
