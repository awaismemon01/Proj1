package HandsOnPractice;

//Java Program to Display Prime Numbers Between Two Intervals

import java.util.Scanner;

//Java Program to Display Prime Numbers Between Two Intervals

public class DisplayPrimeNos {
    public static void main(String[] args) {

        System.out.print("Enter the intervals :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i=a;i<=b;i++) {
            int factor = 2;
            boolean flag = false;
            while (factor <= i / 2) {
                if (i % factor == 0) {
                    flag = true;
                    break;
                }
                ++factor;
            }
            if (!flag) System.out.println(i);

        }
    }
}
