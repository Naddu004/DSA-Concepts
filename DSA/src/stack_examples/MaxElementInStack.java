package stack_examples;

import java.util.Scanner;

public class MaxElementInStack {
    public static void main(String[] args) {
        Stack mainStk = new Stack();
        Stack maxStk  = new Stack();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Stack : ");
        int  size = sc.nextInt();

        mainStk.createStack(size);
        maxStk.createStack(size);

        int ch = 0;
        do{
            System.out.println("\nStack Menu\n----------------\n1.Push\n2.Pop\n3.Peek\n4.Max Element in Stack\n.Print Stack\n0.Exit\n:");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    if(!mainStk.isFull()){
                        System.out.println("Enter data:");
                        int e=sc.nextInt();
                        mainStk.push(e);
                        if(mainStk.isEmpty()){
                            maxStk.push(e);
                        }
                        else{
                            if(maxStk.peek() < e){
                                maxStk.push(e);
                            }
                        }
                    }
                    else {
                        System.out.println("Stack is FUll");
                    }
                    break;
                case 2:
                    if(!mainStk.isEmpty()){

                    }
            }
        }while(ch != 0);
    }
}
