package HandsOnPractice;

import java.time.LocalDate;
import java.time.Month;

public class CheckBirthday {
    public static void main(String[] args) {

        int date = 8;
        Month month = Month.FEBRUARY;

        LocalDate today = LocalDate.now();

        if(today.getDayOfMonth()==date && today.getMonth()==month){
            System.out.println("Happy Birthday");
        }
        else
            System.out.println("Not Today");
    }
}
