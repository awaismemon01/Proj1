package Stack;
//Implement Fixed size Stack Using Interface
public class FixedStack implements  IntStack{
    private int top;
    private int stck[];

    FixedStack(int size){
        stck = new int[size];
        top=-1;
    }

    @Override
    public void push(int item) {
        if (top== stck.length-1) System.out.println("Stack is Full");
        else stck[++top]=item;
    }

    @Override
    public int pop() {
        if (top<0){
            System.out.println("Stack is empty");
            return 0;
        }
        else
            return stck[top--];

    }
}

class TestInt{
    public static void main(String[] args) {
        FixedStack s1 = new FixedStack(5);
        FixedStack s2 = new FixedStack(10);

        for(int i=0; i<5; i++) s1.push(i);
        for(int i=0; i<10; i++) s2.push(i);

        s1.push(6);
        System.out.println("Stack s1:");
        for(int i=0; i<5; i++)
            System.out.println(s1.pop());

        System.out.println("Stack s2:");
        for(int i=0; i<10; i++)
            System.out.println(s2.pop());

        s2.pop();
    }
}
