package HandsOnPractice.Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Select from below :");
        System.out.println("1. Sum Of Natural Numbers\n2. Factorial of Number\n3.GCD of Two Numbers");
        System.out.print("Your Choice : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice==1){

            SumOfNaturalNos sumOfNaturalNos = new SumOfNaturalNos();
            System.out.print("Enter the Number : ");
            int result = sumOfNaturalNos.evaluate(scanner.nextInt());
            System.out.println("The answer is : "+result);

        }

        else if(choice==2){
            Factorial factorial = new Factorial();
            System.out.print("Enter the Number : ");
            int result = factorial.evaluate(scanner.nextInt());
            System.out.println("The answer is : "+result);

        }

        else if (choice==3){
            GCD gcd = new GCD();
            System.out.print("Enter two Numbers : ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result;
            if(a>b){
                result = gcd.evaluate(a,b);
                System.out.println("The GCD of numbers "+a+" and "+b+" is :"+result);
            }
            else if(b>a){
                result = gcd.evaluate(b,a);
                System.out.println("The GCD of numbers "+a+" and "+b+" is :"+result);
            }
            else{
                System.out.println("Same Numbers!");
            }
        }

        else if (choice==4){
            Exponent exponent = new Exponent();
            System.out.print("Enter the base and its power : ");
            int base = scanner.nextInt();
            int power = scanner.nextInt();
            int result = exponent.evaluate(base,power);
            System.out.println("The Answer of "+base+"^"+power+" is : "+result);
        }


        else{
            System.out.println("Invalid Choice");
        }

    }
}
