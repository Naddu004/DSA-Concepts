package question3;

import entity.Stack;

public class RemoveMiddleElementByRecursion {
    public static void main(String[] args) {
        Stack stk = new Stack();
        int size = 7;
        stk.createStack(size);
        stk.push(1);
        stk.push(12);
        stk.push(31);
        stk.push(10);
        stk.push(8);
        stk.push(15);
        stk.push(11);

        stk.printStack();
        System.out.println();
        removeMidElement(stk, size);
        stk.printStack();
    }
    public static void removeMidElement(Stack stk, int size){
        if(stk.getStackSize() == size/2+1){
            stk.pop();
            return;
        }
        int temp = stk.pop();
        removeMidElement(stk, size);
        stk.push(temp);
        return;
    }
}
