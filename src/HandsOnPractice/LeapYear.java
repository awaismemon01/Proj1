package HandsOnPractice;

//Java Program to Check Leap Year

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to be checked :");
        int year = scanner.nextInt();
        boolean leap;

        /*IDE improved code
        ================================================
        if(year%4 == 0){
            leap = year % 100 != 0 || year % 400 == 0;
        }
        else{
            leap = false;
        }
        ================================================*/


        //MY CODE
        if(year%4 == 0){
            if(year%100==0 && year%400!=0){
                leap=false;
            }
            else{
                leap=true;
            }
        }
        else{
            leap = false;
        }




        if(leap){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }

    }
}
