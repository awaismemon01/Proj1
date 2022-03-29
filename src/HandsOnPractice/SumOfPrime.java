package HandsOnPractice;

import java.util.Scanner;

//Java program to display a number as sum of primes

public class SumOfPrime {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean flag = false;

        for (int i=2; i<=number/2; i++){
            if (isPrime(i)) {
                if(isPrime(number-i)){
                    System.out.println(number+" = "+i+" + "+(number-i));
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println(number+" Cannot be displayed as sum of prime");
        }


    }

    static boolean isPrime(int n){
        boolean check = true;

        for (int i=2; i<=n/2; i++){
            if(n%i==0){
                check = false;
                break;
            }
        }

        return check;
    }

}
