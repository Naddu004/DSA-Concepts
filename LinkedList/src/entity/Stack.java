package entity;

public class Stack {
    int tos, maxSize, stk[];
     public void createStack(int size){
        maxSize = size;
        stk = new int[size];
        tos = -1;
    }
    public boolean isFull(){
        if(tos == maxSize-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int element){
            tos++;
            stk[tos] = element;
    }
    public int stackSize(){
        return tos+1;
    }
    public boolean isEmpty(){
        if(tos == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public int pop(){
        int temp = stk[tos];
        tos--;
        return temp;
    }
    public int peek() {
        return stk[tos];
    }
    void printStack(){
        for(int i = tos; i >= 0; i--){
            System.out.print(stk[i] + " ");
        }
    }
}
