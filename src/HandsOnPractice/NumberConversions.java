package HandsOnPractice;

public class NumberConversions {
    public static void main(String[] args) {

        int a = 23;
        System.out.println("Decimal value : "+a);
        System.out.println("IN BINARY "+Integer.toBinaryString(a));
        System.out.println("IN OCTAL "+Integer.toOctalString(a));
        System.out.println("IN HEXADECIMAL "+Integer.toHexString(a));

        long b = 110111;
        System.out.println("Binary value : "+b);
        String str1 = String.valueOf(b);
        int decimalNo = Integer.parseInt(str1, 2);
        System.out.println("IN DECIMAL "+decimalNo);
        System.out.println("IN OCTAL "+Integer.toOctalString(decimalNo));
        System.out.println("IN HEXADECIMAL "+Integer.toHexString(decimalNo));

        int c = 26;
        System.out.println("Octal value : "+c);
        String str2 = String.valueOf(c);
        decimalNo = Integer.parseInt(str2,8);
        System.out.println("IN BINARY "+Integer.toBinaryString(decimalNo));
        System.out.println("IN DECIMAL "+decimalNo);
        System.out.println("IN HEXADECIMAL "+Integer.toHexString(decimalNo));



    }
}
