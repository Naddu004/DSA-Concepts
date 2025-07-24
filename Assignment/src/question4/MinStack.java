package question4;

import entity.Stack;

import java.util.Scanner;

public class MinStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack();
        Stack temp = new Stack();
        System.out.print("Enter Size of Stack : ");
        int size = sc.nextInt();
        stk.createStack(size);
        temp.createStack(size);
        int ch = 0;
        do{
            System.out.println("\nStack Menu\n----------------\n1.Push\n2.Pop\n3.Peek\n4.Min Element in Stack\n.5Print Stack\n0.Exit\n:");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    if(!stk.isFull()){
                        System.out.println("Enter data : ");
                        int e=sc.nextInt();
                        stk.push(e);
                        if(temp.isEmpty()){
                            temp.push(e);
                        }
                        else{
                            if(temp.peek() > e){
                                temp.push(e);
                                System.out.println(e + " is Pushed.");
                            }
                        }
                    }
                    else {
                        System.out.println("Stack is FUll.");
                    }
                    break;
                case 2:
                    if(!stk.isEmpty()){
                        int elmt = stk.pop();
                        System.out.println(elmt + " is Poped.");
                        if(temp.peek() == elmt && !temp.isEmpty()){
                            temp.pop();
                        }
                    }
                    else{
                        System.out.println("Stack is Empty.");
                    }
                    break;
                case 3:
                    if(!stk.isEmpty()){
                        System.out.println("Peek Element is : " + stk.peek());
                    }
                    else{
                        System.out.println("Stack is Empty.");
                    }
                    break;
                case 4:
                    if(!temp.isEmpty()){
                        System.out.println("Min Element in Stack is : " + temp.peek());
                    }
                    else{
                        System.out.println("Stack is Empty.");
                    }
                    break;
                case 5:
                    if(stk.isEmpty()){
                        System.out.println("Stack is Empty.");
                    }
                    else{
                        stk.printStack();
                    }
                    break;
                case 0:
                    System.out.println("Thanks for  using Code.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(ch != 0);
    }
}
