package question3;

import entity.Stack;

public class GetMiddelElementFromStack {
    public static void main(String[] args) {
        Stack stk = new Stack();
        int size = 5;
        stk.createStack(size);
        stk.push(1);
        stk.push(12);
        stk.push(31);
        stk.push(10);
        stk.push(8);

        stk.printStack();
        System.out.println();
        System.out.println(removeMidElement(stk, size) + " Removed.");
        stk.printStack();
    }
    public static int removeMidElement(Stack stk, int size){
        Stack tempStk = new Stack();
        tempStk.createStack(size/2);
        for(int i = 0; i < size/2; i++){
            tempStk.push(stk.pop());
        }
        int temp = stk.pop();
        while(!tempStk.isEmpty()){
            stk.push(tempStk.pop());
        }
        return temp;
    }
}