package HandsOnPractice;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        double principle;
        int rate,time;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle amount : ");
        principle = scanner.nextDouble();
        System.out.print("Enter the rate of interest : ");
        rate = scanner.nextInt();
        System.out.print("Enter the time period : ");
        time = scanner.nextInt();

        System.out.println("Simple interest is : "+((principle*time*rate)/100));

    }
}
