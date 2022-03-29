package HandsOnPractice.Recursion;

public class GCD implements RecursiveInterface{

    //Dummy Method to prevent error
    @Override
    public int evaluate(int num) {
        return 0;
    }

    @Override
    public int evaluate(int num1, int num2) {
        if (num2 != 0)
            return evaluate(num2, num1 % num2);
        else
            return num1;

    }
}
