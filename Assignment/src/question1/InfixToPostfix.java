package question1;

import entity.StackChar;

import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter Equation : ");
        String equation = sc.nextLine();

        StackChar stk = new StackChar();
        stk.createStack(equation.length());

        String postFix = "";

        for(int i = 0; i < equation.length(); i++){
            char ch = equation.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                postFix += ch;
            }
            else if(ch == '('){
                stk.push(ch);
            }
            else if(ch == ')'){
                while(stk.peek() != '('){
                    postFix += stk.pop();
                }
                stk.pop();
            }
            else{
                if(stk.is_empty()){
                    stk.push(ch);
                }
                else if(getPrecidence(ch) > getPrecidence(stk.peek())){
                    stk.push(ch);
                }
                else{
                    while(!stk.is_empty()){
                        postFix += stk.pop();
                    }
                    stk.push(ch);
                }
            }
        }
        while(!stk.is_empty()){
            postFix += stk.pop();
        }

        System.out.println(postFix);
    }
    public static int getPrecidence(char ch){
        if(ch == '^'){
            return 3;
        }
        else if(ch == '/' || ch == '*'){
            return 2;
        }
        else if(ch == '+' || ch == '-'){
            return 1;
        }
        return 0;
    }
}
