package HandsOnPractice.Recursion;

public interface RecursiveInterface {
    int evaluate(int num);
    default int evaluate(int num1,int num2){return 0;}
}
