package HandsOnPractice.Recursion;

public class SumOfNaturalNos implements RecursiveInterface{
    @Override
    public int evaluate(int num) {
        if(num!=0){
            return num + evaluate(num-1);
        }
        else {
            return num;
        }
    }
}
