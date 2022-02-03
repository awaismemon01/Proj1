package HandsOnPractice;

//Java Program to Display Alphabets (A to Z) using loop

public class DisplayAlphabets {
    public static void main(String[] args) {

        //A-65 Z-90 a-97 z-122
        System.out.println("Alphabets in Upper Case :");
        for(int i=65; i<=90; i++){
            System.out.print((char) i);
            System.out.print(" ");
        }

        System.out.println("\nAlphabets in Lower Case :");
        for(int i=97; i<=122; i++){
            System.out.print((char) i);
            System.out.print(" ");
        }

    }
}
