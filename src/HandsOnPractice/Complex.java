package HandsOnPractice;

//Java Program to add two complex numbers

public class Complex {
    double imaginary;
    double real;

    Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public static void main(String[] args) {

        Complex n1 = new Complex(3.4,5.0);
        Complex n2 = new Complex(2.8,3.0);

        Complex result = add(n1, n2);


        System.out.printf("Answer is : %.2f + %.2fi",result.real,result.imaginary);

    }

    public static Complex add(Complex n1,Complex n2){
        Complex temp = new Complex(0.0,0.0);

        temp.real= n1.real+ n2.real;
        temp.imaginary= n1.imaginary+ n2.imaginary;

        return temp;
    }
}
