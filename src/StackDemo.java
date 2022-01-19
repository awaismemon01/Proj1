class  Stack{
    int s[] = new int[10];
    int top;

    Stack(){
        top=-1;
    }
    void push(int item){
        if(top==9){
            System.out.println("Stack is Full");
        }
        else{
            s[++top]= item;
        }
    }

    int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return s[top--];

    }

    int peak(){
        return s[top];
    }

}

public class StackDemo {
    public static void main(String[] args) {

        Stack s1 = new Stack();
        Stack s2 = new Stack();

        for (int i = 1; i < 11; i++) {
            s1.push(i);
        }

        for (int i = 1; i < 11; i++) {
            s2.push(i);
        }

        //for(int i=0;i<10;i++)


        for (int i = 0; i < 5; i++){
            //s1.pop();
            System.out.println("Value popped :" + s1.pop());
        }

        for(int i=0;i<10;i++){
            s2.pop();
        }

        s2.pop();

        System.out.println("Current top value of s1 : "+s1.peak());
    }
}
