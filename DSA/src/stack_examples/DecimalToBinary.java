package stack_examples;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        Stack stk = new Stack();
        stk.createStack(20);
        while(num != 0){
            int bit = num % 2;
            stk.push(bit);
            num = num / 2;
        }
        stk.printStack();
    }
}
