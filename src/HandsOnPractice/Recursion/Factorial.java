package HandsOnPractice.Recursion;

public class Factorial implements RecursiveInterface{
    @Override
    public int evaluate(int num) {
        if(num>=1){
            return num*evaluate(num-1);
        }
        else {
            return 1;
        }
    }
}
