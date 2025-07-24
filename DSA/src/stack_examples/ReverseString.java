package stack_examples;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack_char stk = new Stack_char();
        stk.create_stack(str.length());
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            stk.push(str.charAt(i));
        }
        for(int i = 0; i < str.length(); i++){
            ans = ans + stk.pop();
        }
        System.out.println(ans);
        ///stk.print_stack();
    }
}
