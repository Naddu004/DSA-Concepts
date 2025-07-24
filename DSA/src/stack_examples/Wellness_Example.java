package stack_examples;

import java.util.Scanner;

public class Wellness_Example {
    public static void main(String args[])
    {
        Stack_char obj=new Stack_char();
        Scanner in =new Scanner(System.in);
        System.out.println("Enter data:");
        String input=in.next();
        boolean flag=true;
        obj.create_stack(input.length());
        for(int i=0;i<input.length();i++) {
            char c = input.charAt(i);//read char by char
            if (c == '{')
                obj.push(c);
            else if (c == '}')
            {
                if (obj.is_empty() != true)
                    obj.pop();
                else
                {
                    flag=false;
                    System.out.println("Error: } unexpected");
                    break;
                }
            }
        }
        if(obj.is_empty()==true && flag==true)
            System.out.println("Perfectly balanced");
        else
            System.out.println("Error: } expected");

    }
}
