package Collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack= new Stack<Integer>();

        stack.push(45);
        stack.push(25);
        stack.push(10);
        stack.push(66);

        System.out.println(stack);

        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

    }
}
