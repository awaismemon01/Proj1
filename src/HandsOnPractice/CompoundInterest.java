package HandsOnPractice;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        double principle,rate,time,number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle amount : ");
        principle = scanner.nextDouble();
        System.out.print("Enter the rate of interest : ");
        rate = scanner.nextDouble();
        System.out.print("Enter the time period : ");
        time = scanner.nextDouble();
        System.out.print("Enter the number of times interest is compounded : ");
        number = scanner.nextDouble();

        double ci = principle*(Math.pow((1+rate/100),(number*time))) - principle;
        System.out.println("The compound interest is : "+ci);
    }
}
