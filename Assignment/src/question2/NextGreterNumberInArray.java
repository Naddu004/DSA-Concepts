package question2;

import entity.Stack;

import java.util.ArrayList;

public class NextGreterNumberInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        ArrayList<Integer> ans = new ArrayList<>();
        Stack stk = new Stack();
        stk.createStack(10);
        for(int i = arr.length-1; i >= 0; i--){
            if(stk.isEmpty()){
                ans.addFirst(-1);
                stk.push(arr[i]);
            }
            else{
                if(arr[i] > stk.peek()){
                    while(!stk.isEmpty() && stk.peek() <= arr[i]){
                        stk.pop();
                    }
                    if(stk.isEmpty()){
                        ans.addFirst(-1);
                        stk.push(arr[i]);
                    }
                    else{
                        ans.addFirst(stk.peek());
                        stk.push(arr[i]);
                    }
                }
                else{
                    ans.addFirst(stk.peek());
                    stk.push(arr[i]);
                }
            }
        }
        for(int it : ans){
            System.out.print(it + " ");
        }
    }
}
