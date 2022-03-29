package HandsOnPractice;

public class SwapNumbers {
    public static void main(String[] args) {


        int a = (int) (Math.random()*100);
        int b = (int) (Math.random()*100);

        System.out.println("Before swapping the values of a and b are : "+a+" "+b);
        a= a-b;
        b= a+b;
        a= b-a;
        System.out.println("After swapping the values of a and b are : "+a+" "+b);

    }
}
