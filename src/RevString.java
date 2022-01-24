import java.util.Scanner;

interface  StringFunc{
    String func(String n);
}

public class RevString {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            int i;
            StringBuilder result = new StringBuilder();

            for (i = str.length() - 1; i >= 0; i--) {
                result.append(str.charAt(i));
            }
            return result.toString();
        };
        Scanner sc = new Scanner(System.in);
        String s1;
        do {
            System.out.print("Enter the string to reverse : ");
            s1 = sc.nextLine();
            if(s1.equals("0")) continue;
            System.out.println(s1 + " Reversed is " + reverse.func(s1));

        } while (!s1.equals("0"));
        sc.close();
    }
}
