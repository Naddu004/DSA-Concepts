package stack_examples;

public class Stack {
    int tos, maxSize, stk[];
    void createStack(int size){
        maxSize = size;
        stk = new int[size];
        tos = -1;
    }
    boolean isFull(){
        if(tos == maxSize-1){
            return true;
        }
        else{
            return false;
        }
    }
    void push(int element){
            tos++;
            stk[tos] =element;
    }
    int stackSize(){
        return tos+1;
    }
    boolean isEmpty(){
        if(tos == -1){
            return true;
        }
        else{
            return false;
        }
    }
    int pop(){
        int temp = stk[tos];
        tos--;
        return temp;
    }
    int peek() {
        return stk[tos];
    }
    void printStack(){
        for(int i = tos; i >= 0; i--){
            System.out.print(stk[i] + " ");
        }
    }
}
