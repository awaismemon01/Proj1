import java.util.Scanner;

class Fact{
    int fact(int i){
        int result;
        if(i<1) return 0;
        if(i==1) return 1;
        result = fact(i-1) * i;
        return  result;
    }
}
public class Factorial {
    public static void main(String[] args) {
        Fact factorial = new Fact();
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Factorial is "+factorial.fact(sc.nextInt()));
        sc.close();
    }
}
