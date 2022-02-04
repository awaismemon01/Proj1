package HandsOnPractice.Recursion;

public class Exponent implements RecursiveInterface{

    //Dummy Method
    @Override
    public int evaluate(int num) {
        return 0;
    }

    @Override
    public int evaluate(int base, int power) {
        if(power!=0){
            return (base*evaluate(base,power-1));
        }
        else {
            return 1;
        }
    }
}
