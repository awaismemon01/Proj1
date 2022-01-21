package Stack;
//Implement a GROWABLE Stack Using Interface
public class DynStack implements IntStack{
    private int top;
    private int stck[];

    DynStack(int size){
        stck = new int[size];
        top=-1;
    }

    @Override
    public void push(int item) {
        //The length of the Stack is Doubled when STACK is Full and push is called
        if (top== stck.length-1){
            int[] temp = new int[stck.length*2];
            for(int i=0; i<stck.length; i++) temp[i]= stck[i];
            stck=temp;
            stck[++top]=item;
        }
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
